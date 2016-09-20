package com.movingtoweb.service;

import com.movingtoweb.config.ConfigurationSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloworld")
public class HelloWorldService {

    @Autowired
    private ConfigurationSettings configurationSettings;

    @RequestMapping(value = "/name")
    public String getName() {
        return configurationSettings.getName();
    }

}
