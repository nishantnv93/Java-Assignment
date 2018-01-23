package com.springmvc.Runner;

import com.springmvc.controller.CountryController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springmvc")
public class RunnerClass extends SpringBootServletInitializer{
    public RunnerClass(){
        System.out.println("Runner Class");
    }
    public static void main(String [] args){
        SpringApplication.run(RunnerClass.class, args);
    }
}
