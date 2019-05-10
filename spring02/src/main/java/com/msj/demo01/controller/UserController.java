package com.msj.demo01.controller;

import com.msj.demo01.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/hello")
    public String hello(@Validated User user, Errors errors){
        if(errors.hasErrors()){
            System.out.println("no");
            return "pages/fail.jsp";
        }else{
            System.out.println(user);
            return "pages/success.jsp";
        }
    }
}
