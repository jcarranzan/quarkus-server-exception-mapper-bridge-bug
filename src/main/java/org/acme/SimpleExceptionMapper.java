package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;

@ApplicationScoped
public class SimpleExceptionMapper {

    @ServerExceptionMapper(IllegalArgumentException.class)
    public RestResponse<?> toResponse(IllegalArgumentException e) {
        return RestResponse.status(497);
    }
}
