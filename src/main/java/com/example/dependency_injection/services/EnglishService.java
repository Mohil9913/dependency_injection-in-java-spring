package com.example.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("languageSpecificGreeting")
public class EnglishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
