package com.in28minutes.microservices.limit_service.controller;

import com.in28minutes.microservices.limit_service.configuration.Config;
import com.in28minutes.microservices.limit_service.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Config config;

    @GetMapping("/limits")
    public Limit retrieveLimits() {
        return new Limit(config.getMaximum(), config.getMinimum());
    }
}
