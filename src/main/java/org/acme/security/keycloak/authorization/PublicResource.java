package org.acme.security.keycloak.authorization;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api/public")
public class PublicResource {

    @GET
    public String getPublicMessage() {
        return "Hello, world!";
    }
}
