package com.example.dependency_injection.controllers;

import com.example.dependency_injection.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
