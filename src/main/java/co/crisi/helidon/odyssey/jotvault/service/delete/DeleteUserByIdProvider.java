package co.crisi.helidon.odyssey.jotvault.service.delete;

import co.crisi.helidon.odyssey.jotvault.repository.UserRepository;
import co.crisi.helidon.odyssey.jotvault.service.DeleteByIdProvider;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DeleteUserByIdProvider implements DeleteByIdProvider<Long> {

    private final UserRepository repository;

    @Inject
    public DeleteUserByIdProvider(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(Long id) {
        repository.deleteById(id);
    }
}
