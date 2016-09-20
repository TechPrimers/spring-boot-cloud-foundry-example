package com.movingtoweb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationSettings {

    @Value("${config.app.name}")
    private String name;

    @Value("${greeting}")
    private String greeting;

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }
}
