package com.example.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class XmlApplication {

    public static void main(String[] args) {

        SpringApplication.run(XmlApplication.class, args);
    }

}
