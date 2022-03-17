package com.enjoy.cap5;

import com.enjoy.cap5.config.Config5MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

public class Cap5MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config5MainConfig.class);

    }
}
