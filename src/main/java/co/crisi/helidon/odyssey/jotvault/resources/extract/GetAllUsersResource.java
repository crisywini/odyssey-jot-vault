package co.crisi.helidon.odyssey.jotvault.resources.extract;

import co.crisi.helidon.odyssey.jotvault.service.UserService;

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

    private final UserService userService;

    @Inject
    public GetAllUsersResource(UserService userService) {
        this.userService = userService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        return Response.ok(userService.findAll()).build();
    }


}
