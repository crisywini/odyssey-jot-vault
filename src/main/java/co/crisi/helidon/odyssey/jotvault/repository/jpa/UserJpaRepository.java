package co.crisi.helidon.odyssey.jotvault.repository.jpa;

import co.crisi.helidon.odyssey.jotvault.adapter.jpamodel.UserJpaEntity;
import co.crisi.helidon.odyssey.jotvault.repository.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class UserJpaRepository implements UserRepository {

    @PersistenceContext
    protected EntityManager entityManager;


    @Transactional
    @Override
    public UserJpaEntity save(UserJpaEntity entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Transactional
    @Override
    public Optional<UserJpaEntity> findById(Long id) {
        var query = entityManager.createQuery("SELECT u FROM UserJpaEntity u WHERE u.userId = :id", UserJpaEntity.class);
        query.setParameter("id", id);
        return Optional.ofNullable(query.getSingleResult());
    }

    @Transactional
    @Override
    public List<UserJpaEntity> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserJpaEntity> cq = cb.createQuery(UserJpaEntity.class);
        Root<UserJpaEntity> rootEntry = cq.from(UserJpaEntity.class);
        CriteriaQuery<UserJpaEntity> all = cq.select(rootEntry);
        TypedQuery<UserJpaEntity> allQuery = entityManager.createQuery(all);

        return allQuery.getResultList();
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaDelete<UserJpaEntity> delete = cb.createCriteriaDelete(UserJpaEntity.class);
        Root<UserJpaEntity> root = delete.from(UserJpaEntity.class);
        delete.where(cb.equal(root.get("id"), id));
        this.entityManager.createQuery(delete).executeUpdate();
    }

    @Transactional
    @Override
    public UserJpaEntity update(Long id, UserJpaEntity newEntityInfo) {
        entityManager.merge(newEntityInfo);
        return newEntityInfo;
    }
}
