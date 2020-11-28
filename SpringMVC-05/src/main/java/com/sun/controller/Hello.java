package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class Hello  {
    @RequestMapping("/h1")
    public String hello(Model model){
        model.addAttribute("msg","hello Spring");
        return "hello";
    }
}
