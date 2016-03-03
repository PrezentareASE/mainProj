package com.FirstPackage;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
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

    @Autowired
    ErrorLogService errorLogService;

    @Autowired
    @Qualifier("dataSource")
    DriverManagerDataSource dataSource;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

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
        model.addAttribute("message",message + " AND from page mapping "+(1 + (int)(Math.random() * 99999999)));
        System.out.println(message);

        ErrorLog el = new ErrorLog();
        el.setText(message + " AND from page mapping "+(1 + (int)(Math.random() * 99999999)));
        errorLogService.insertMessage(el);

        return "start";
    }

    @RequestMapping(value = "/page2", method = RequestMethod.GET)
    public String helloWorld3(ModelMap mp) {
        String message = helloWorldClass.hello();
        mp.addAttribute("message",message + " AND from page2 mapping "+(1 + (int)(Math.random() * 99999999)));
        System.out.println(message);
        return "start";
    }

    @RequestMapping(value = "/page3", method = RequestMethod.GET)
    public String helloWorld4(ModelMap mp) {
        System.out.println("into hello world method");
        String message = helloWorldClass.hello();
        mp.addAttribute("message",message + " AND from page3 mapping "+(1 + (int)(Math.random() * 99999999)));
        mp.addAttribute("list",getAllMessages());
        System.out.println(message);
        return "page";
    }
    public FirstController(){
        super();
        //System.out.println("FirstController");
    }

    private String getAllMessages(){
        String result="";
        for(ErrorLog el:errorLogService.getMessages()){
            result=result+"<tr><td>"+el.getId()+"</td><td>"+el.getText()+"</td></tr>";
        }
        return result;
    }
}
