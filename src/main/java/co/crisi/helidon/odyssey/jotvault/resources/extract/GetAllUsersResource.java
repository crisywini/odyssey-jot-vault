package co.crisi.helidon.odyssey.jotvault.resources.extract;

import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.service.GetAllProvider;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@ApplicationScoped
public class GetAllUsersResource {

    private final GetAllProvider<IUser> getAllUsersProvider;

    @Inject
    public GetAllUsersResource(GetAllProvider<IUser> getAllUsersProvider) {
        this.getAllUsersProvider = getAllUsersProvider;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        return Response.ok(getAllUsersProvider.run()).build();
    }


}
