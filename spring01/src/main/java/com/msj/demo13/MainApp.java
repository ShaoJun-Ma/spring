package com.msj.demo13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring13.xml");
        User users = (User) context.getBean("users");
        System.out.println("username:"+users.getUsername());
        System.out.println("age:"+users.getAge());
    }
}
