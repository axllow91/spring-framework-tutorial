package com.mrn.didemo.controllers;

import com.mrn.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// How not to do it'
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl") // make sure the qualifier is overriding with the greeting service impl
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
