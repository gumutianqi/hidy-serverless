package com.github.getting.started.config;

import io.vertx.core.json.Json;
import lombok.extern.log4j.Log4j2;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * Application Configuration
 *
 * @author 阿古 (larrykoo@126.com)
 * @date 2021-12-08
 * @since 1.0.0
 */
@Log4j2
@ApplicationScoped
public class AppConfiguration {

    @Inject
    AppProperties properties;

    @PostConstruct
    public void init() {
        log.info("Init Config: \n {} ", Json.encode(properties));
    }
}
