package com.example.dependency_injection.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service";
    }

}
