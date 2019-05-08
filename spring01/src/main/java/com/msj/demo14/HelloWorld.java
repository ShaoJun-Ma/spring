package com.msj.demo14;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
    private Hello hello;

    public Hello getHello() {
        return hello;
    }

    @Autowired
    public void setHello(Hello hello) {
        System.out.println("这是setHello");
        this.hello = hello;
    }

    public void test(){
        hello.testHello();
    }
}
