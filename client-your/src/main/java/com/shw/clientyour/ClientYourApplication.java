package com.shw.clientyour;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientYourApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientYourApplication.class, args);
    }

    @Value("${app.environment}")
    String environment;

    @Value("${my.version}")
    String version;

    @RequestMapping(value = "/hi")
    public String hi(){
        return environment + "," +version;
    }

}
