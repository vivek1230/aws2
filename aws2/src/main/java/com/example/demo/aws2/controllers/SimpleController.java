package com.example.demo.aws2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/check-asw")
    public String checkAsw() {
        return "ASW IS WORKING";
    }

    @GetMapping("/check-asw/{name}")
    public String checkAsw(@PathVariable String name) {
        return "Hello, " + name + "! ASW IS WORKING";
    }
}
