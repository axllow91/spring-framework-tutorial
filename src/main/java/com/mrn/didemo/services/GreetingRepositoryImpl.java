package com.mrn.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello!";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola!";
    }

    @Override
    public String getGermanGreeting() {
        return null;
    }
}
