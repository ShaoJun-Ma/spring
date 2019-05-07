package com.msj.demo05;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("your message:"+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("bean定义");
    }
    public void destroy(){
        System.out.println("bean销毁");
    }
}


