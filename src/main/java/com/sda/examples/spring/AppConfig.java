package com.sda.examples.spring;

import com.sda.examples.spring.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.sda.examples.spring.components",
        "com.sda.examples.spring.beans"})
public class AppConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
