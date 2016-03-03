package com.FirstPackage;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldClass {
    public String hello(){
        return "Hello from autowired bean "+(1 + (int)(Math.random() * 99999999));
    }
   public HelloWorldClass(){
       System.out.println("HelloWorldClass init");
   }
}
