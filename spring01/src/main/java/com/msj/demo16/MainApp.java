package com.msj.demo16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloworldConfig.class);
        Hello he = context.getBean(Hello.class);
        he.setMessage("msj");
        he.getMessage();
    }
}
