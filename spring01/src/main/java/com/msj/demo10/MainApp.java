package com.msj.demo10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//注入集合
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");
        User users = (User) context.getBean("collection");
        users.getUserList();
        users.getUserSet();
        users.getUserMap();
        users.getUserPro();
    }
}
