package com.enjoy.cap4;

import com.enjoy.cap4.config.Cap4MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap4MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
        System.out.println("IOC容器完成");
        Object p = app.getBean("person");
    }
}
