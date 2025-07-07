package com.example.dependency_injection.controllers;

import com.example.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyLanguageController {

    private final GreetingService greetingService;

    public MyLanguageController(@Qualifier("languageSpecificGreeting") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
