package com.msj.demo05;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("your message:"+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init(){
        System.out.println("bean定义");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("bean销毁");
    }
}


