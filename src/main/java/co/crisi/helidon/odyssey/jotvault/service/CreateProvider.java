package co.crisi.helidon.odyssey.jotvault.service;

public interface CreateProvider<T> {

    T create(T object);
}
