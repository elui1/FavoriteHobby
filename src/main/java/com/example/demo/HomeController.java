package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/WhatIsGo")
    public String whatIsGo() {
        return "WhatIsGo";
    }

    @RequestMapping("/Bootstrap")
    public String bootStrap() {
        return "Bootstrap";
    }

    @RequestMapping("/WhyPlayGo")
    public String whyPlayGo() {
        return "WhyPlayGo";
    }
}
