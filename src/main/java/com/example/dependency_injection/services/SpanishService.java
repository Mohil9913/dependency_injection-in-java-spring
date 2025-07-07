package com.example.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("languageSpecificGreeting")
public class SpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo!";
    }
}
