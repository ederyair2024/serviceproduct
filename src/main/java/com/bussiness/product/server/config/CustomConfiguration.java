package com.bussiness.product.server.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class CustomConfiguration {
    private final Environment env;

    @PostConstruct
    public void logApplicationProperties() {
        log.info("{}={}", "app.name", env.getProperty("spring.application.name"));
        log.info("{}={}", "app.version", env.getProperty("version.app"));
    }
}
