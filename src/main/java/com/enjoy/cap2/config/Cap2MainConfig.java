package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap2.controller.OrderController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//会去扫描拥有这些 @Controller @Service @Repository @Component注解的类
@ComponentScan(value = "com.enjoy.cap2",includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {TypeFilter.class})
},useDefaultFilters = false)
public class Cap2MainConfig {
    @Bean
    public Person person(){
        return new Person("godY",22);
    }
}
