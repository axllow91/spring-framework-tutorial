package com.mrn.didemo.controllers;

import com.mrn.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// A way to do it by injecting the setter method
@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingService")
    // we can use the qualifier annotation on the setter method
    // outside or inside the method definition(along side param)
    public void setGreetingService(/*@Qualifier("setterGreetingService")*/ GreetingService greetingService) {
        this.greetingService = greetingService;
    }


}
