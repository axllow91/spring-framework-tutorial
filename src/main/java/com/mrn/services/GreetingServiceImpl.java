package com.mrn.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HIELO_ME = "HIELO ME! - Origina(GreetingServiceImpl)";

    @Override
    public String sayGreeting() {
        return HIELO_ME;
    }
}
