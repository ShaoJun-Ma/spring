package com.msj.demo15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring15.xml");
        User user = (User)context.getBean("user");
        user.printName();
        user.printAge();
    }
}
