package com.example.thymeleafconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
}
