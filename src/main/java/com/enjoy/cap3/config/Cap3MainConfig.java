package com.enjoy.cap3.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap2.config.TypeFilter;
import org.springframework.context.annotation.*;

@Configuration
public class Cap3MainConfig {
    @Scope(value = "prototype")
    @Bean
    public Person person(){
        return new Person("godY",22);
    }
}
