package com.assignment6.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String [] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        HelloWorld hw1 = (HelloWorld)context.getBean(HelloWorld.class);
        HelloWorld hw2 = (HelloWorld)context.getBean(HelloWorld.class);
        HelloWorld hw3 = (HelloWorld)context.getBean(HelloWorld.class);
        HelloWorld hw4 = (HelloWorld)context.getBean(HelloWorld.class);
        HelloWorld hw5 = (HelloWorld)context.getBean(HelloWorld.class);
        hw1.setMessage("Hello Nishant");
        hw2.setMessage("Hello Nishant Verma");
        //hw1.getMessage();
        hw2.display();
        hw1.display();
    }
}
