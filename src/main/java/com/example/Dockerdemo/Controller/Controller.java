package com.example.Dockerdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {
    @GetMapping("/login")
    public String login() {
        return ("login successful");
    }
    @GetMapping("/registeration")
    public String register(){
        return ("register success");
    }
}


