package com.FirstPackage;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPExample {

  /*  @Autowired
    ErrorLogService errorLogService;*/

    @Before("execution(* com.FirstPackage.*.hello())")
    public void getAllAdvice(){
        System.out.println("Hello message will be called after this method");
        /*ErrorLog el = new ErrorLog();
        el.setText("Hello message called");
        errorLogService.insertMessage(el);*/
    }

    @After("execution(* com.FirstPackage.*.hello())")
    public void getAllAdviceAfter(){
        System.out.println("Hello message was called");
        /*ErrorLog el = new ErrorLog();
        el.setText("Hello message called");
        errorLogService.insertMessage(el);*/
    }
}
