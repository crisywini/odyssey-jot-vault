package co.crisi.helidon.odyssey.jotvault.resources.filter;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.List;


@Slf4j
@Provider
@Priority(1)
public class CORSFilter implements ContainerResponseFilter {

    private final List<String> origins = List.of("http://localhost:8080");

    @Override
    public void filter(ContainerRequestContext containerRequestContext,
                       ContainerResponseContext containerResponseContext) throws IOException {
        log.info("Adding CORS");
        var headers = containerResponseContext.getHeaders();

        // Allow cross-origin resource sharing from all domains
        headers.add("Access-Control-Allow-Origin", origins);
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        headers.add("Access-Control-Allow-Headers", "Content-Type");

    }
}
