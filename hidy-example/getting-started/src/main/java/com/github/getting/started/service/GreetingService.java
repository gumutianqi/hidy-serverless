package com.github.getting.started.service;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author 阿古 (larrykoo@126.com)
 * @date 2021-12-08
 * @since 1.0.0
 */
@ApplicationScoped
public class GreetingService {
    /**
     * greeting
     *
     * @param name username
     * @return String
     */
    public String greeting(String name) {
        return "hello:" + name;
    }
}
