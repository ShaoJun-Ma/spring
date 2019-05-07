package com.msj.demo09;

public class HelloWorld {
    private Hello hello;

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        System.out.println("这是setHello");
        this.hello = hello;
    }

    public void test(){
        hello.testHello();
    }

}
