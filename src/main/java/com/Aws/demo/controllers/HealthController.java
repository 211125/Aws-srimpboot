package com.Aws.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping
    public String health() {
        return "El grupo B es cool";
    }
}
