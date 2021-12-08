package com.github.getting.started.filter;

import io.vertx.core.http.HttpServerRequest;
import lombok.extern.log4j.Log4j2;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * LoggingFilter
 *
 * @author 阿古 (larrykoo@126.com)
 * @date 2021-12-08
 * @since 1.0.0
 */
@Log4j2
@Provider
public class LoggingFilter implements ContainerRequestFilter {

    @Context
    UriInfo info;

    @Context
    HttpServerRequest request;

    @Override
    public void filter(ContainerRequestContext context) throws IOException {
        final MultivaluedMap<String, String> headers = context.getHeaders();
        final String method = context.getMethod();
        final String path = info.getPath();
        final String address = request.remoteAddress().toString();

        log.debug("Request: {}-{} from IP[{}] and headers: {}", method, path, address, headers);
    }
}
