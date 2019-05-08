package com.msj.demo16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloworldConfig {
    @Bean
    public Hello hello(){
        return new Hello();
    }
}
