package com.enjoy.cap6;

import com.enjoy.cap6.config.Cap6MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
