package com.oserion.framework.web.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    public static final String PROPERTY_SPRING_CONTEXT_API = "spring.context.api";
    public static final String PROPERTY_CONFIG_PATH = "app.config.path";
}