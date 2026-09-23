package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RotaController {

    @GetMapping("/")
    public String hello() {
        return "A API Spring Boot está a funcionar perfeitamente!";
    }
}