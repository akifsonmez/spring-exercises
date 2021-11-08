package com.akifsonmez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAOPApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringAOPApp.class, args);
    }
}
