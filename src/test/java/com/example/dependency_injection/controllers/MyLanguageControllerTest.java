package com.example.dependency_injection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyLanguageControllerTest {

    @Autowired
    MyLanguageController myLanguageController;

    @Test
    void sayHello() {

        System.out.println(myLanguageController.sayHello());
    }
}