package com.mrn.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimarySpanisGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanisGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Servicio de saludo Primario";
    }
}
