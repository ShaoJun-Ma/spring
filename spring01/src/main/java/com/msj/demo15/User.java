package com.msj.demo15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
    @Autowired
    @Qualifier("student2")
    private Student student;

    public User(){
        System.out.println("这是user构造器");
    }

    public void printName(){
        System.out.println("sname:"+student.getSname());
    }

    public void printAge(){
        System.out.println("age:"+student.getAge());
    }
}
