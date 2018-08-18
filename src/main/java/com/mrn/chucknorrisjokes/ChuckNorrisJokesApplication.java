package com.mrn.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// this tells spring context to search for an xml config file called with the name chuck-config.xml
// spring will pull that in
@ImportResource("classpath:chuck-config.xml")
public class ChuckNorrisJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckNorrisJokesApplication.class, args);
    }
}
