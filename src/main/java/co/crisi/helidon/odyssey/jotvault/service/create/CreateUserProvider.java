package co.crisi.helidon.odyssey.jotvault.service.create;

import co.crisi.helidon.odyssey.jotvault.adapter.jpamodel.UserJpaEntity;
import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.model.impl.User;
import co.crisi.helidon.odyssey.jotvault.repository.UserRepository;
import co.crisi.helidon.odyssey.jotvault.service.CreateProvider;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CreateUserProvider implements CreateProvider<IUser> {

    private final UserRepository repository;

    @Inject
    public CreateUserProvider(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public IUser run(IUser user) {
        var entity = UserJpaEntity.builder()
                .userId(user.getUserId())
                .username(user.getUsername())
                .email(user.getEmail())
                .password(user.getPassword())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
        var entitySaved = repository.save(entity);
        return User.builder()
                .userId(entitySaved.getUserId())
                .username(entitySaved.getUsername())
                .email(entitySaved.getEmail())
                .password(entitySaved.getPassword())
                .firstName(entitySaved.getFirstName())
                .lastName(entitySaved.getLastName())
                .build();
    }
}
