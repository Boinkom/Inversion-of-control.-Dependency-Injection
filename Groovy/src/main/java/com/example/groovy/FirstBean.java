package com.example.application;

import com.example.groovy.PrototypeBean;
import org.springframework.stereotype.Component;

@Component
public class FirstBean {
    private com.example.application.SecondBean secondBean;
    public FirstBean(PrototypeBean prototypeBean){
        System.out.println("First bean created!");
        System.out.println("Prototype bean first " + prototypeBean.toString());
    }
    public void setSecondBean(com.example.application.SecondBean secondBean){
        this.secondBean = secondBean;
    }
}
