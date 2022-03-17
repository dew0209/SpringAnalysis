package com.enjoy.cap6.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap6.bean.Cat;
import com.enjoy.cap6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Dog.class, Cat.class,JamesImportSelector.class,JamesImportBeanDefinitionRegistrar.class})
public class Cap6MainConfig {
    /**
     * 给容器中注册bean的方式
     * 1.@Bean：[导入第三方的类或者组件]，比如person为第三方的类或者组件
     * 2.包扫描+组件的注解（例如：@ComponentScan + @Component形式）：一般是针对自己写的类
     * 3.@Import：快速给容器导入一个组件 注意：@Bean有点简单
     *          a.@Import(要导入到容器中的组件)：容器会自动注册这个组件，bean的id为全类名
     *          b.ImportSelector：是一个接口，返回需要导入到容器的组件的全类名数组
     *          c.ImportBeanDefinitionRegistrar：可以手动添加组件到IOC容器，所有bean的注册可以使用BeanDefinitionRegistry来判断是否存在其他bean。见JamesImportBeanDefinitionRegistrar
     *
     */
    //容器启动时初始化person的bean
    //id是person
    @Bean
    public Person person(){
        return new Person("张三",22);
    }
}
