package com.example.application;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestScopeBean {
    public RequestScopeBean(){
        System.out.println("Hello from the request scope bean!");
    }
}
