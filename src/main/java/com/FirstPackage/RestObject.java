package com.FirstPackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestObject {
    @Autowired
    private OtherObject obj;

    private int id=7;
    private String description = "description";
    private List<OtherObject> lst = new ArrayList<OtherObject>();
    public void addThreeElements(){
        System.out.println(obj.toString());
        lst.add(obj);
        lst.add(obj);
        lst.add(obj);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<OtherObject> getLst() {
        return lst;
    }

    public void setLst(List<OtherObject> lst) {
        this.lst = lst;
    }
}
