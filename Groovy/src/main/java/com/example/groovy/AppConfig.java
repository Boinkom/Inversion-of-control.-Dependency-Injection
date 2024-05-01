package com.example.groovy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }

    @Bean
    com.example.application.FirstBean firstBean(PrototypeBean prototypeBean) {
        return new com.example.application.FirstBean(prototypeBean);
    }

    @Bean
    @RequestScope
    RequestScopeBean requestScopeBean() {
        return new RequestScopeBean();
    }
}
