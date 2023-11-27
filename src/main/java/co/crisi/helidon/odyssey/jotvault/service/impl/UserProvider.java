package co.crisi.helidon.odyssey.jotvault.service.impl;

import co.crisi.helidon.odyssey.jotvault.adapter.jpamodel.UserJpaEntity;
import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.model.impl.User;
import co.crisi.helidon.odyssey.jotvault.repository.UserRepository;
import co.crisi.helidon.odyssey.jotvault.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserProvider implements UserService {

    private final UserRepository repository;

    @Inject
    public UserProvider(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public IUser save(IUser user) {
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

    @Override
    public IUser getById(Long id) {

        var entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("The user was with id %d not found!", id)));
        return User.builder()
                .userId(entity.getUserId())
                .username(entity.getUsername())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .build();
    }

    @Override
    public List<IUser> findAll() {
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

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public IUser update(Long id, IUser newEntityInfo) {

        var updated = repository.update(id, UserJpaEntity.builder()
                .userId(newEntityInfo.getUserId())
                .username(newEntityInfo.getUsername())
                .email(newEntityInfo.getEmail())
                .password(newEntityInfo.getPassword())
                .firstName(newEntityInfo.getFirstName())
                .lastName(newEntityInfo.getLastName())
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
