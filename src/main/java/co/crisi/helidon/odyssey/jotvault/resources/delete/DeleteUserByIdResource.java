package co.crisi.helidon.odyssey.jotvault.resources.delete;

import co.crisi.helidon.odyssey.jotvault.service.DeleteByIdProvider;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/users")
@RequestScoped
public class DeleteUserByIdResource {

    private final DeleteByIdProvider<Long> deleteUserByIdProvider;

    @Inject
    public DeleteUserByIdResource(DeleteByIdProvider<Long> deleteUserByIdProvider) {
        this.deleteUserByIdProvider = deleteUserByIdProvider;
    }

    @GET
    @Path("/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        deleteUserByIdProvider.run(id);
        return Response.status(200)
                .entity(String.format("User with id %d was removed", id))
                .build();
    }

}
