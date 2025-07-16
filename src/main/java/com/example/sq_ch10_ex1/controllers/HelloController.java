package com.example.sq_ch10_ex1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello endpoint was called");
        return "Hello!";
    }

    @GetMapping("/ciao")
    public String ciao() {
        System.out.println("Ciao endpoint was called");
        return "Ciao!";
    }
}
