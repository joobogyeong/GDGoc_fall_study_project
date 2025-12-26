package com.example.springproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String Home() {
        return "index";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register/index";
    }

    @GetMapping("loginPage")
    public String loginPage() {
        return "login/index";
    }
}
