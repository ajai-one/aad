package com.aj.springboot.aad.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){ 
        return "<h1>Hello World </h1>";
    }
    
}
