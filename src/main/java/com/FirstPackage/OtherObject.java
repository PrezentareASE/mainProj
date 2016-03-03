package com.FirstPackage;

import org.springframework.stereotype.Component;

@Component
public class OtherObject {
    private int numar;

    private String text;

    public OtherObject(){
        numar = 777;
        text = "TEST";
        System.out.println(">>>Other object was generated<<<");
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
