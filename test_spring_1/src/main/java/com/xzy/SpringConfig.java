package com.xzy;

import com.xzy.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean("test")
    public User user() {
        return new User("xzy", 10);

    }
}
