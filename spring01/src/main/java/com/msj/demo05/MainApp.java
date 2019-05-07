package com.msj.demo05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring05.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        //registerShutdownHook() 方法。它将确保正常关闭，并且调用相关的 destroy 方法。
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
