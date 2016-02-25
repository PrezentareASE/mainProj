package com.FirstPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController{
    @Autowired
    HelloWorldClass helloWorldClass;


    /*@RequestMapping(value = "/start", method = RequestMethod.GET)
    public String helloWorld(ModelMap model) {

        String message = helloWorldClass.hello();
        model.addAttribute("message",message + ">>>>>>>>>>>from page mapping");
        System.out.println(message);
        return "start";
    }*/

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String helloWorld2(ModelMap model) {

        String message = helloWorldClass.hello();
        model.addAttribute("message",message + " AND from page mapping");
        System.out.println(message);
        return "start";
    }

    @RequestMapping(value = "/page2", method = RequestMethod.GET)
    public String helloWorld3(ModelMap mp) {
        System.out.println("into hello world method");
        String message = helloWorldClass.hello();
        mp.addAttribute("message",message + " AND from page2 mapping");
        System.out.println(message);
        return "start";
    }

    @RequestMapping(value = "/page3", method = RequestMethod.GET)
    public String helloWorld4(ModelMap mp) {
        System.out.println("into hello world method");
        String message = helloWorldClass.hello();
        mp.addAttribute("message",message + " AND from page3 mapping");
        System.out.println(message);
        return "page";
    }
    public FirstController(){
        super();
        //System.out.println("FirstController");
    }

}
