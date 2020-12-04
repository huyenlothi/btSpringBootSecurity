package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class HomeController {
    @GetMapping("/")
    public String demo(){
        return "home";
    }
    @GetMapping("/user")
    public String demo1(){
        return "page1";
    }
    @GetMapping("/admin")
    public String demo2(){
        return "page2";
    }
    @GetMapping("/page403")
    public String demo3(){
        return "khongcoquyen";
    }
}
