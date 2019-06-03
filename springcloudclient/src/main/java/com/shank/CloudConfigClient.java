package com.shank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/cloudclient")
@RefreshScope
public class CloudConfigClient {

    @Value("${user.name}")
    private String userName;

    public static void main(String... args){
        SpringApplication.run(CloudConfigClient.class);
    }

    @GetMapping("/who")
    public String getUserName(){
        return userName;
    }
}
