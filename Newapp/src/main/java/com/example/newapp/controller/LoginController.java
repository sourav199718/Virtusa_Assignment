package com.example.newapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // renders login.html
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        // Basic dummy validation (replace with real user check)
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "redirect:/employees";
        } else {
            return "redirect:/login?error=true";
        }
    }
}
