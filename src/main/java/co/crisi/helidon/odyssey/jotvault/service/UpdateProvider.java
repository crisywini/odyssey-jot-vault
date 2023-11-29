package co.crisi.helidon.odyssey.jotvault.service;

public interface UpdateProvider<T, ID> {

    T run(ID id, T newInfo);

}
