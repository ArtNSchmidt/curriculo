package com.example.landing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {

    @GetMapping("/")
    public String home() {
        return "curriculo"; // Nome do arquivo HTML em templates (sem .html)
    }
}

