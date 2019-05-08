package com.msj.demo16;

public class Hello {
    private String message;

    public String getMessage() {
        System.out.println("your message:"+message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
