package com.example.springbootweb.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;


    @GetMapping("/")
    public String demoPage(Model model) {
        model.addAttribute("appName", appName);
        return "demo";
    }

    @GetMapping("/index")
    public String indexPage(Model model) {
        return "index";
    }
}