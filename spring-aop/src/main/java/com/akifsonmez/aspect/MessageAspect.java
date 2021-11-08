package com.akifsonmez.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {

    @Before("execution(* com.akifsonmez.service.MessageService.saveMessage(..))")
    public void runBeforeSaveMessage(JoinPoint joinPoint) {
        String message = (String) joinPoint.getArgs()[0];
        System.out.println("before service call: " + message);

    }

    @After("execution(* com.akifsonmez.service.MessageService.saveMessage(..))")
    public void runAfterSaveMessage(JoinPoint joinPoint) {
        String message = (String) joinPoint.getArgs()[0];
        System.out.println("after service call: " + message);
    }

}
