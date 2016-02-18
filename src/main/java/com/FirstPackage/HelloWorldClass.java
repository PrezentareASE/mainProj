package com.FirstPackage;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldClass {
    public String hello(){
        return "Hello from autowired bean";
    }
   public HelloWorldClass(){
       //System.out.println("HelloWorldClass init");
   }
}
