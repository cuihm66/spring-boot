package org.example.springboot.config;

import org.example.springboot.service.IHelloService;
import org.example.springboot.service.impl.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    public IHelloService helloService() {
        System.out.println("加载配置文件。。。。。。。。");
        return new HelloServiceImpl();
    }
}
