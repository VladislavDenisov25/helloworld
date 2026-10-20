package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    // Аннотация @GetMapping обозначает, что этот метод обрабатывает GET-запросы.
    @GetMapping("/hello")
    public String sayHello() {
        // Возвращаем простое сообщение.
        return "Hello, World!";
    }
}
