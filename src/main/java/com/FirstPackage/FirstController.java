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

    @RequestMapping(value = "/start.htm", method = RequestMethod.GET)
    public String helloWorld(ModelMap model) {
        System.out.println("into hello world method");
        String message = helloWorldClass.hello();
        model.addAttribute("message",message);
        System.out.println(message);
        return "start";
    }

    @RequestMapping(value = "/page.htm", method = RequestMethod.GET)
    public ModelAndView helloWorld2(ModelAndView model) {
        System.out.println("into hello world method 2");

        String message = helloWorldClass.hello();
        model.addObject("x", message);
        return model;
    }

    @RequestMapping(value = "/page2", method = RequestMethod.GET)
    public ModelAndView helloWorld3() {
        System.out.println("into hello world method 3");
        String message = helloWorldClass.hello();
        //model.addAttribute("x",message);
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("x",message);
        return mv;
    }
    public FirstController(){
        super();
        //System.out.println("FirstController");
    }

}
