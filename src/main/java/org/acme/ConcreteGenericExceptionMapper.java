package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;

@ApplicationScoped
public class ConcreteGenericExceptionMapper extends AbstractGenericExceptionMapper<TestException> {

    @ServerExceptionMapper(TestException.class)
    public RestResponse<?> toResponse(TestException e) {
        return RestResponse.status(499);
    }
}
