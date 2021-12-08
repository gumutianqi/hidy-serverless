package com.github.getting.started.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.jackson.ObjectMapperCustomizer;

import javax.inject.Singleton;

/**
 * RegisterCustomModuleCustomizer
 *
 * @author 阿古 (larrykoo@126.com)
 * @date 2021-12-08
 * @since 1.0.0
 */
@Singleton
public class RegisterCustomModuleCustomizer implements ObjectMapperCustomizer {
    @Override
    public void customize(ObjectMapper mapper) {
        // add SerializationInclusion
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        // add SerializationFeature
    }
}
