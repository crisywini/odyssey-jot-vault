package co.crisi.helidon.odyssey.jotvault.service;

public interface DeleteByIdProvider<ID> {

    void run(ID id);

}
