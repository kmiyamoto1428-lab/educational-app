package com.kyosei.educational_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "redirect:/register";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}