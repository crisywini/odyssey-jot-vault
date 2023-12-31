package co.crisi.helidon.odyssey.jotvault.resources.delete;

import co.crisi.helidon.odyssey.jotvault.service.DeleteByIdProvider;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@RequestScoped
public class DeleteUserByIdResource {

    private final DeleteByIdProvider<Long> deleteUserByIdProvider;

    @Inject
    public DeleteUserByIdResource(DeleteByIdProvider<Long> deleteUserByIdProvider) {
        this.deleteUserByIdProvider = deleteUserByIdProvider;
    }

    @DELETE
    @Path("/{id}")
    @CircuitBreaker(requestVolumeThreshold = 1, failureRatio = 0.5, delay = 1000, successThreshold = 2)
    @Fallback(fallbackMethod = "tryAgain")
    public Response deleteById(@PathParam("id") Long id) {
        deleteUserByIdProvider.run(id);
        return Response.status(200)
                .entity(String.format("User with id %d was removed", id))
                .build();
    }

    public Response tryAgain(Long id) {
        return Response.status(500)
                .entity("Circuit is open, no further calls")
                .build();
    }

}
