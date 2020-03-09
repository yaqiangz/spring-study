package com.zyq.config;

import com.zyq.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 也会被Spring容器托管, 注册到容器中, 因为这个注解本来就是一个@Component, @Configuration代表这是一个配置类, 相当于beans.xml
@ComponentScan("com.zyq.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    // 注册一个bean, 相当于配置文件xml中的bean标签
    // 方法名相当于bean标签中的id属性
    // 方法的返回值, 相当于bean标签中的class属性
    @Bean
    public User getUser() {
        return new User(); // 就是返回要注入到bean的对象
    }
}
