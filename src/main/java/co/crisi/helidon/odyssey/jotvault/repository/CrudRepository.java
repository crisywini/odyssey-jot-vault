package co.crisi.helidon.odyssey.jotvault.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, ID> {

    T save(T entity);

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);

    T update(ID id, T newEntityInfo);

}
