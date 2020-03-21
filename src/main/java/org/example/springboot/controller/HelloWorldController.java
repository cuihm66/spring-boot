package org.example.springboot.controller;

import org.example.springboot.service.IHelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ApplicationContext context;


    @RequestMapping("/hello")
    public String hello(){
        boolean b = context.containsBean("helloService");
        Object service = context.getBean("helloService");
        IHelloService iHelloService = (IHelloService)service;
        logger.info("hashcode" + iHelloService.hashCode());
        logger.info("" + b);
        return "hello";
    }
}
