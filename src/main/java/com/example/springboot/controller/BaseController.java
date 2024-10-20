package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/") // creates a GET call with end point as health-check
    public String healthCheck() {
        return "Service is up and running";
    }

}
