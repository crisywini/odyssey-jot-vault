package co.crisi.helidon.odyssey.jotvault.service.update;

import co.crisi.helidon.odyssey.jotvault.adapter.jpamodel.UserJpaEntity;
import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.model.impl.User;
import co.crisi.helidon.odyssey.jotvault.repository.UserRepository;
import co.crisi.helidon.odyssey.jotvault.service.UpdateProvider;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class UpdateUserProvider implements UpdateProvider<IUser, Long> {

    private final UserRepository repository;


    @Inject
    public UpdateUserProvider(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public IUser run(Long id, IUser newInfo) {
        var updated = repository.update(id, UserJpaEntity.builder()
                .userId(newInfo.getUserId())
                .username(newInfo.getUsername())
                .email(newInfo.getEmail())
                .password(newInfo.getPassword())
                .firstName(newInfo.getFirstName())
                .lastName(newInfo.getLastName())
                .build());

        return User.builder()
                .userId(updated.getUserId())
                .username(updated.getUsername())
                .email(updated.getEmail())
                .password(updated.getPassword())
                .firstName(updated.getFirstName())
                .lastName(updated.getLastName())
                .build();
    }
}
