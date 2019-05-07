package com.msj.demo06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring06.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.getMessage1();
        objA.getMessage2();

        Hello hello = (Hello)context.getBean("hello");
        hello.getMessage1();
        hello.getMessage2();
        hello.getMessage3();
    }
}
