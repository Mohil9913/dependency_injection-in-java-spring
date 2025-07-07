package com.example.dependency_injection.controllers;

import com.example.dependency_injection.services.GreetingService;
import com.example.dependency_injection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        greetingService = new GreetingServiceImpl();
    }


    public String sayHello(){

        System.out.println("I am in the Controller");

        return greetingService.sayGreeting();
    }
}
