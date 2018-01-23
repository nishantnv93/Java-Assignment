package com.assignment5.springcore;

public class HelloWorld {
    private String message;

    public HelloWorld(){
        System.out.println("HI");
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void display(){
        System.out.println("The Message is:" +this.message);
    }
}