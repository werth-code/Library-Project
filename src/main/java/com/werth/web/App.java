package com.werth.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {

    @GetMapping("/")
    public String hello() {
        return "Spring is WORKING!!!";
    }
}
