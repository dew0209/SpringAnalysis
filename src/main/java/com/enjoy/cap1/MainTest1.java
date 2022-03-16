package com.enjoy.cap1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        /* IOC容器相当于一个很大的map */
        Person p = (Person)app.getBean("person");
        System.out.println(p);
    }
}
