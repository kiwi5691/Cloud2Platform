package com.kikicloud.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.kikicloud.authentication"})
public class Oauth2AuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2AuthenticationApplication.class, args);
    }

}