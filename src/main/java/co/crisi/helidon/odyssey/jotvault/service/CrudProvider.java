package co.crisi.helidon.odyssey.jotvault.service;

import java.util.List;
import java.util.Optional;

public interface CrudProvider<T, ID> {

    T save(T entity);

    T getById(ID id);

    List<T> findAll();

    void deleteById(ID id);

    T update(ID id, T newEntityInfo);

}
