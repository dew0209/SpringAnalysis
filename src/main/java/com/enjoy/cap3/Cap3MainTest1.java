package com.enjoy.cap3;

import com.enjoy.cap3.config.Cap3MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap3MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        //证明@Bean是单实例
        /*Person p = (Person)app.getBean("person");
        Person p1 = (Person)app.getBean("person");
        System.out.println(p == p1);*/
    }
}
