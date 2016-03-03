package com.FirstPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class WebServiceRest {

    @Autowired
    RestObject ro;

    @RequestMapping(method = RequestMethod.GET)
    public RestObject select(){
        ro.addThreeElements();
        return ro;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String insert(){ return null;}

    @RequestMapping(method = RequestMethod.PUT)
    public String update(){ return null;}

    @RequestMapping(method = RequestMethod.DELETE)
    public String delete(){ return null;}

    /*
    @GET
    @Produces("application/json")
    public RestObject select(){ return new RestObject();}
    */

    public WebServiceRest(){
        super();
    }
}
