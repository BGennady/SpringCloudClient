package ru.netology.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
