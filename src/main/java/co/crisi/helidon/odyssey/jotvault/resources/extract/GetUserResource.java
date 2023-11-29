package co.crisi.helidon.odyssey.jotvault.resources.extract;

import co.crisi.helidon.odyssey.jotvault.model.IUser;
import co.crisi.helidon.odyssey.jotvault.service.GetByIdProvider;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@RequestScoped
public class GetUserResource {

    private final GetByIdProvider<IUser, Long> getUserByIdProvider;

    @Inject
    public GetUserResource(GetByIdProvider<IUser, Long> getUserByIdProvider) {
        this.getUserByIdProvider = getUserByIdProvider;
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserById(@PathParam("id") Long id) {
        return Response.ok(getUserByIdProvider.run(id)).build();
    }

}
