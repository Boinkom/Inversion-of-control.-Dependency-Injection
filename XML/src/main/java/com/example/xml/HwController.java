package com.example.xml;

import com.example.application.RequestScopeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HwController {

    private RequestScopeBean requestScopeBean;

    @Autowired
    public HwController(RequestScopeBean requestScopeBean){
        this.requestScopeBean = requestScopeBean;
    }

    @GetMapping("/")
    public String HW(){
        StringBuilder b = new StringBuilder();
        b.append("HW!\n\n");
        b.append("First call of the request scoped bean: \n");
        b.append(requestScopeBean.toString());
        b.append("\n\n");
        b.append("Second call of the request scoped bean: \n");
        b.append(requestScopeBean.toString());
        b.append("\n");
        return b.toString();
    }
}
