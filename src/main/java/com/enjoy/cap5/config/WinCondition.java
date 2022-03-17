package com.enjoy.cap5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition {
    /**
     *
     * @param context  判断条件使用的上下文环节
     * @param metadata  类的注解信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取环境变量
        Environment en = context.getEnvironment();
        //获取操作系统的名字
        String str = en.getProperty("os.name");
        if (str.contains("Windows"))return true;
        return false;
    }
}
