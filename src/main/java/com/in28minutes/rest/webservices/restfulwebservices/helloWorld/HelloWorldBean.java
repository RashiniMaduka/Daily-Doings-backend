package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {


    private String message;

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public HelloWorldBean(String message) {
        this.message=message;
    }

    public void setMessage(String message) {
        this.message=message;
    }
}
