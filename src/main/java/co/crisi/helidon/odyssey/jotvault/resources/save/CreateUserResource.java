package co.crisi.helidon.odyssey.jotvault.resources.save;

import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.model.impl.User;
import co.crisi.helidon.odyssey.jotvault.service.CreateProvider;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@ApplicationScoped
public class CreateUserResource {

    private final CreateProvider<IUser> createUserProvider;

    @Inject
    public CreateUserResource(CreateProvider<IUser> createUserProvider) {
        this.createUserProvider = createUserProvider;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@RequestBody User user) {
        var userCreated = createUserProvider.run(user);
        return Response.status(Response.Status.CREATED)
                .entity(userCreated)
                .build();
    }

}
