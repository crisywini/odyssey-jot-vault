package co.crisi.helidon.odyssey.jotvault.service.extract;

import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.model.impl.User;
import co.crisi.helidon.odyssey.jotvault.repository.UserRepository;
import co.crisi.helidon.odyssey.jotvault.service.GetByIdProvider;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GetUserByIdProvider implements GetByIdProvider<IUser, Long> {

    private final UserRepository repository;

    @Inject
    public GetUserByIdProvider(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public IUser run(Long id) {
        var entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        String.format("The user was with id %d not found!", id)));
        return User.builder()
                .userId(entity.getUserId())
                .username(entity.getUsername())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .build();
    }
}
