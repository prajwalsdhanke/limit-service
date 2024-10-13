package com.in28minutes.microservices.limit_service.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-service")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Config {
    private int maximum;
    private int minimum;
}
