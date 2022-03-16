package com.enjoy.cap4.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Cap4MainConfig {
    @Lazy
    @Bean
    public Person person(){
        return new Person("godY",22);
    }
}
