package com.simplilearn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Authentication";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Authentication is protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Authentication from admin";
    }

}