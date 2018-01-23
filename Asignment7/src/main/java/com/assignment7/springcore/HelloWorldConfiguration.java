package com.assignment7.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    @Scope("prototype")
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
