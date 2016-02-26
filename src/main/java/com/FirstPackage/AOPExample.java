package com.FirstPackage;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class AOPExample {

  /*  @Autowired
    ErrorLogService errorLogService;*/

    @Before("execution(* com.FirstPackage.*.hello())")
    public void getAllAdvice(){
        System.out.println("Hello message called");
        /*ErrorLog el = new ErrorLog();
        el.setText("Hello message called");
        errorLogService.insertMessage(el);*/
    }


}
