package com.example.landing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurriculumController {

    @GetMapping("/")
    public String index() {
        return "curriculum/index";
    }

    @GetMapping("/formacao")
    public String formacao() {
        return "curriculum/formacao";
    }

    @GetMapping("/habilidades")
    public String habilidades() {
        return "curriculum/habilidades";
    }
}