package com.pack.securityapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/page1")
    public String page1() {
        return "page1";
    }
    @GetMapping("/admin")
    public String admin() {
        return "adminPanel";
    }
}