package co.crisi.helidon.odyssey.jotvault.service.extract;

import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.model.impl.User;
import co.crisi.helidon.odyssey.jotvault.repository.UserRepository;
import co.crisi.helidon.odyssey.jotvault.service.GetAllProvider;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class GetAllUsersProvider implements GetAllProvider<IUser> {

    private final UserRepository repository;

    @Inject
    public GetAllUsersProvider(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<IUser> run() {
        return repository.findAll()
                .stream().map(entity -> User.builder()
                        .userId(entity.getUserId())
                        .username(entity.getUsername())
                        .email(entity.getEmail())
                        .password(entity.getPassword())
                        .firstName(entity.getFirstName())
                        .lastName(entity.getLastName())
                        .build())
                .collect(Collectors.toList());
    }
}
