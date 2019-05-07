package com.msj.demo12;

import org.omg.PortableInterceptor.INACTIVE;

public class HelloWorld {
    private Hello hello;
    private String name;
    private Integer age;

    public HelloWorld(Hello hello, String name, Integer age) {
        this.hello = hello;
        this.name = name;
        this.age = age;
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }

    public void test(){
        hello.testHello();
    }
}
