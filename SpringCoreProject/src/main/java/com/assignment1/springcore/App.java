package com.assignment1.springcore;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class App {
    public static void main(String [] args){
        Resource r=new ClassPathResource("spring.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        HelloWorld hw=(HelloWorld)factory.getBean("helloworld");
        hw.display();
    }
}
