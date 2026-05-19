package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class TestResource {

    @GET
    @Path("/generic")
    @Produces(MediaType.TEXT_PLAIN)
    public String throwGeneric() {
        throw new TestException("generic mapper test");
    }

    @GET
    @Path("/non-generic")
    @Produces(MediaType.TEXT_PLAIN)
    public String throwNonGeneric() {
        throw new IllegalArgumentException("non-generic mapper test");
    }
}
