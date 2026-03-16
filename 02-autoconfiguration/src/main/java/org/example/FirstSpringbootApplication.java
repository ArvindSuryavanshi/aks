package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(FirstSpringbootApplication.class, args);

        System.out.println("Spring Boot Application Started...");
    }

}