package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class helloworldcontroller {
    @GetMapping(path = "/hello-world")
    public String helloworld(){
        return "hello world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){
        //throw new RuntimeException("Some error has happened!Contact support");

        return new HelloWorldBean("hello world");
    }
    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world,%s",name));
    }
}
