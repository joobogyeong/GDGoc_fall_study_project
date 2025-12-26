package com.example.springproject1.controller;

import com.example.springproject1.entity.Role;
import com.example.springproject1.entity.User;
import com.example.springproject1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        String userPassword = user.getPassword();
        System.out.println(userPassword);
        user.setRole(Role.MEMBER);
        String passwordEncoderd = passwordEncoder.encode(userPassword);
        user.setPassword(passwordEncoderd);
        userService.insertUser(user);
        return "redirect:/loginPage";
    }

}
