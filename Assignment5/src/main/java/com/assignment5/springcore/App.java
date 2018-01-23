package com.assignment5.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorld hw=(HelloWorld)context.getBean("helloworld");
        HelloWorld hw1=(HelloWorld)context.getBean("helloworld");
        HelloWorld hw2=(HelloWorld)context.getBean("helloworld");
        HelloWorld hw3=(HelloWorld)context.getBean("helloworld");
        hw.display();
    }
}