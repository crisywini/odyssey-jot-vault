package co.crisi.helidon.odyssey.jotvault.repository.jpa;

import co.crisi.helidon.odyssey.jotvault.repository.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class UserJpaRepository implements UserRepository {

    @PersistenceContext
    protected EntityManager entityManager;


    @Transactional
    @Override
    public UserJpaRepository save(UserJpaRepository entity) {

        entityManager.persist(entity);

        return entity;
    }

    @Transactional
    @Override
    public Optional<UserJpaRepository> findById(Long aLong) {
        return Optional.empty();
    }

    @Transactional
    @Override
    public List<UserJpaRepository> findAll() {
        return null;
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) {

    }

    @Transactional
    @Override
    public UserJpaRepository update(Long aLong, UserJpaRepository newEntityInfo) {
        return null;
    }
}
