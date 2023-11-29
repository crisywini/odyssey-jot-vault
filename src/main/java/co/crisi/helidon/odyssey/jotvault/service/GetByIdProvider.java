package co.crisi.helidon.odyssey.jotvault.service;

public interface GetByIdProvider<T, ID> {

    T run(ID id);
}
