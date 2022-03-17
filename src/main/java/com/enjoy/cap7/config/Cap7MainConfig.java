package com.enjoy.cap7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cap7MainConfig {
    @Bean
    public JamesFactoryBean jamesFactoryBean(){
        return new JamesFactoryBean();
    }
}
