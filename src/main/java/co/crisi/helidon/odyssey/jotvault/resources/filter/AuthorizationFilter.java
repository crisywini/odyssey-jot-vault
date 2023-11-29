package co.crisi.helidon.odyssey.jotvault.resources.filter;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.List;

@Slf4j
@Provider
@Priority(Priorities.AUTHORIZATION)
public class AuthorizationFilter implements ContainerRequestFilter {


    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        if (!checkAuthorizationHeader(containerRequestContext)) {
            containerRequestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
        }

    }

    private boolean checkAuthorizationHeader(ContainerRequestContext context) {
        return context.getHeaders().getOrDefault("Authorization", List.of())
                .contains("iconic");
    }

}
