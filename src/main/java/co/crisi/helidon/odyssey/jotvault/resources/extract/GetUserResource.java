package co.crisi.helidon.odyssey.jotvault.resources.extract;

import co.crisi.helidon.odyssey.jotvault.service.UserService;

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

    private final UserService userService;

    @Inject
    public GetUserResource(UserService userService) {
        this.userService = userService;
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserById(@PathParam("id") Long id) {
        return Response.ok(userService.getById(id)).build();
    }

}
