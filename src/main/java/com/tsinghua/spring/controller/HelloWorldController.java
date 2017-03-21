package com.tsinghua.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/tsinghua")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello tsinghua!");
        return "helloWorld";
    }
}