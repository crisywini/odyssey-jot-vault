package co.crisi.helidon.odyssey.jotvault.service.create;

import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.service.CreateProvider;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreateUserProvider implements CreateProvider<IUser> {
    @Override
    public IUser create(IUser object) {
        return null;
    }
}
