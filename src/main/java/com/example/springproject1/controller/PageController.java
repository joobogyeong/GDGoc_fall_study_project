package com.example.springproject1.controller;


import com.example.springproject1.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/registerPage")
    public String registerPage(HttpServletRequest request,org.springframework.ui.Model model) {
        CsrfToken csrfToken = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
        model.addAttribute("_csrf",csrfToken);
        return "register/index";
    }
    @GetMapping("/loginPage")
    public String loginPage(HttpServletRequest request,org.springframework.ui.Model model) {
        CsrfToken csrfToken = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
        model.addAttribute("_csrf",csrfToken);
        return "login/index";
    }
    @GetMapping("/noticeAddPage")
    public String noticeAddPage(Model model, Authentication authentication) {
        String writer = userService.findWriter(authentication.getName());
        model.addAttribute("writer");
        return "noticeAdd/index";
    }
}
