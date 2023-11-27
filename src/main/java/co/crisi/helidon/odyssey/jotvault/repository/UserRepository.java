package co.crisi.helidon.odyssey.jotvault.repository;

import co.crisi.helidon.odyssey.jotvault.repository.jpa.UserJpaRepository;

public interface UserRepository extends CrudRepository<UserJpaRepository, Long> {
}
