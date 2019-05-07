package com.msj.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//创建配置文件spring02.xml，注入属性值hello spring
public class MainApp {
    public static void main(String[] args) {
        //使用ApplicationContext容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring02.xml");
        HelloWorld helloWorld = context.getBean("helloWorld",HelloWorld.class);
        helloWorld.getMessage();
    }
}
