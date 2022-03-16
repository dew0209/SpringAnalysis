package com.enjoy.cap1.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类=配置文件
@Configuration
public class MainConfig {
    //给容器中注册一个bean，类型为返回值类型
    //@Bean(name = "aa")可以手动指定id
    @Bean
    public Person person(){
        return new Person("godY",22);
    }
}