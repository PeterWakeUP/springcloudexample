package com.shw.clientmy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientMyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientMyApplication.class, args);
    }


    @Value("${app.environment}")
    String environment;

    @Value("${my.name}")
    String name;

    @RequestMapping(value = "/hi")
    public String hi(){
        return environment + "," +name;
    }

}
