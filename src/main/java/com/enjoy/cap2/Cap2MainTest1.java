package com.enjoy.cap2;

import com.enjoy.cap2.config.Cap2MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap2MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Object o1 = app.getBean("orderController");
        Object o2 = app.getBean("orderController");
        System.out.println(o1);
        System.out.println(o2);
    }
}
