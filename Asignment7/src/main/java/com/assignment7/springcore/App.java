package com.assignment7.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String [] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        HelloWorld hw1 = (HelloWorld)context.getBean(HelloWorld.class);
        HelloWorld hw2 = (HelloWorld)context.getBean(HelloWorld.class);
        HelloWorld hw3 = (HelloWorld)context.getBean(HelloWorld.class);
        HelloWorld hw4 = (HelloWorld)context.getBean(HelloWorld.class);
        HelloWorld hw5 = (HelloWorld)context.getBean(HelloWorld.class);
        hw2.setMessage("HELLO NISHANT");
        hw2.display();
        hw1.setMessage("HELLO NISHANT VERMA");
        hw1.display();
    }
}
