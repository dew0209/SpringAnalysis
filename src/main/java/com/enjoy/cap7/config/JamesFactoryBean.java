package com.enjoy.cap7.config;

import com.enjoy.cap7.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

public class JamesFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }
    /*
    * true 是单例
    * false 是多例
    * */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
