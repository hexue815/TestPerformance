package com.xue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/test")
    public String hello(Model model){
        model.addAttribute("msg", "hello Springmvc");
        return "hello";
    }
}
