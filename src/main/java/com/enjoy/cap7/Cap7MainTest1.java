package com.enjoy.cap7;

import com.enjoy.cap7.config.Cap7MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap7MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfig.class);
        System.out.println("IOC end");
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("========");
        Object bean1 = app.getBean("jamesFactoryBean");
        String[] names1 = app.getBeanDefinitionNames();
        for (String name : names1) {
            System.out.println(name);
        }
        Object bean2 = app.getBean("jamesFactoryBean");
        System.out.println(bean1 == bean2);
        System.out.println(bean1.getClass());
    }
}
