package com.hdfc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.hdfc")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean("List")
    public List<String> getCities() {
        return List.of("MUMBAI", "DELHI", "KOLKATA");
    }

}
