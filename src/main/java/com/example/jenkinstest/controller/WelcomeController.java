package com.example.jenkinstest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class WelcomeController {


    @GetMapping("/welcome/{name}")
    public ResponseEntity<Object> welcomeUser(@PathVariable String name)
    {
        String message = "hello "+ name;

        return ResponseEntity.ok(message);
    }
}
