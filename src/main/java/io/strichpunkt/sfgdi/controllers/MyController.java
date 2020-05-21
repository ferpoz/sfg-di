package io.strichpunkt.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import io.strichpunkt.sfgdi.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;
    
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String SayHello() {
        return greetingService.sayGreeting();
    }
}