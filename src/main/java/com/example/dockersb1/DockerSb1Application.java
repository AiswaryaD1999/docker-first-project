package com.example.dockersb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSb1Application {

    @GetMapping("/message")
    public String message() {
        return "Hello World from DockerSb1Application";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerSb1Application.class, args);
    }

}
