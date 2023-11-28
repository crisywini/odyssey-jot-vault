package co.crisi.helidon.odyssey.jotvault.repository;

import co.crisi.helidon.odyssey.jotvault.adapter.jpamodel.UserJpaEntity;
import co.crisi.helidon.odyssey.jotvault.repository.jpa.UserJpaRepository;

public interface UserRepository extends CrudRepository<UserJpaEntity, Long> {
}
