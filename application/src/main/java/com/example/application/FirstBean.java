package com.example.application;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {
    private SecondBean secondBean;
    public FirstBean(PrototypeBean prototypeBean){
        System.out.println("First bean created!");
        System.out.println("Prototype bean first " + prototypeBean.toString());
    }
    public void setSecondBean(SecondBean secondBean){
        this.secondBean = secondBean;
    }
}
