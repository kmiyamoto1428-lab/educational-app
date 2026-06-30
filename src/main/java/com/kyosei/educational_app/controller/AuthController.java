package com.kyosei.educational_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyosei.educational_app.service.UserService;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestParam String email,
                           @RequestParam String password) {
        
        try {
            userService.register(email, password);
            return "redirect:/login";
        } catch (IllegalArgumentException e) {
            return "redirect:/register?error";
        }
    }
}