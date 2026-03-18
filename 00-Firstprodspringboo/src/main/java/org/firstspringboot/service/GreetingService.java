package org.firstspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hello, Spring Boot Auto Configuration!";
    }

}
