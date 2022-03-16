package com.enjoy.cap1;

import com.enjoy.cap1.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
        /* IOC容器相当于一个很大的map */
        Person p = (Person)app.getBean("aa");
        System.out.println(p);
        //获取所有的bean的id
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
