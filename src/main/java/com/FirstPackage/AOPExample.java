package com.FirstPackage;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AOPExample {
    @Before("execution(* com.FirstPackage.*.hello())")
    public void getAllAdvice(){
        System.out.println("Hello message called");
    }


}
