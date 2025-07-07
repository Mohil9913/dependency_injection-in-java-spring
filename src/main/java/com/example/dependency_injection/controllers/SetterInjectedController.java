package com.example.dependency_injection.controllers;

import com.example.dependency_injection.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
