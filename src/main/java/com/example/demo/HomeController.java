package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping({"/", "/home", "/status"})
    public String home() {
        return "Hello World!!!!! Tak ahoj světe";
    }
}
