package com.github.getting.started.config;

import io.smallrye.config.ConfigMapping;
import lombok.Data;

import java.io.Serializable;
import java.util.Optional;

/**
 * application properties
 *
 * @author 阿古 (larrykoo@126.com)
 * @date 2021-12-08
 * @since 1.0.0
 */
@Data
@ConfigMapping(prefix = "hidy.application")
public class AppProperties implements Serializable {
    /**
     * 应用 ID
     */
    private String appId;

    /**
     * 应用 Name
     */
    private String appName;

    /**
     * 应用版本号，如：v1.0.0
     */
    private String version;

    /**
     * 应用描述信息
     */
    private Optional<String> description;
}
