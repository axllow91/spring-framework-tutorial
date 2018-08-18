package com.mrn.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de", "default"}) // will be the default profile if no profile will be active
                            // (see application.properties: there is not spring.profiles.active=)
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Primarer Gruddienst";
    }
}
