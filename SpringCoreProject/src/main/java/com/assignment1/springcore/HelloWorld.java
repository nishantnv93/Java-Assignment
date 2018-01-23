package com.assignment1.springcore;

public class HelloWorld {
    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void display(){
        System.out.println("The message is:- " +this.message);
    }
}
