package org.example.runner;

import org.example.service.GreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final GreetingService greetingService;

    public AppRunner(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void run(String... args) {

        System.out.println("Application Runner Started");

        String message = greetingService.greet();

        System.out.println(message);
    }
}