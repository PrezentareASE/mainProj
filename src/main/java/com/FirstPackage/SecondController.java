package com.FirstPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
    @Autowired
    HelloWorldClass helloWorldClass;

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String helloWorld(ModelMap model) {
        System.out.println("into hello world method");
        String message = helloWorldClass.hello();
        model.addAttribute("message",message);
        System.out.println(message);
        return "start";
    }


    public SecondController(){
        super();
        //System.out.println("SecondController");
    }

}
