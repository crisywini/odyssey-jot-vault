package co.crisi.helidon.odyssey.jotvault.resources.filter;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Slf4j
@Provider
@Priority(2)
public class LoggingFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        var message = String.format("Request received: %s is secured: %s ",
                containerRequestContext.getUriInfo().getPath(), containerRequestContext.getSecurityContext().isSecure());
        log.info(message);
    }
}
