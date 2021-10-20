package com.akifsonmez.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloAPI {

    // why not private ? conventions, unit-tests, logically public
    @GetMapping
    public String getHello() {
        return "Hello";
    }


}
