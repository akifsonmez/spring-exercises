package com.akifsonmez.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    
    public String saveMessage(String message) {
        System.out.println("Service call: " + message);
        return "returned " + message;
    }
}
