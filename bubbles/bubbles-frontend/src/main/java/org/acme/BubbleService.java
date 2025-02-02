package org.acme;

import java.io.InputStream;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/bubble")
@RegisterRestClient
public interface BubbleService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    JsonObject bubble();
}
