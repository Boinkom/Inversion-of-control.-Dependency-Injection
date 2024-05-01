package com.example.application;

import com.example.groovy.PrototypeBean;
import org.springframework.stereotype.Component;

@Component
public class SecondBean {
    public SecondBean(PrototypeBean prototypeBean){
        System.out.println("Second bean created!");
        System.out.println("Prototype bean second " + prototypeBean.toString());
    }
}
