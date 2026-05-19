package org.acme;

import org.jboss.resteasy.reactive.RestResponse;

public abstract class AbstractGenericExceptionMapper<E extends Exception> {

    public abstract RestResponse<?> toResponse(E e);
}
