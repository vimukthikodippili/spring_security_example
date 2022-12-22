package com.example.demo.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";

    }
    @GetMapping("/admin")
    public String admin(){
        System.out.println("admin");
        return "admin";

    }
    @GetMapping("/user")
    public String user(){
        System.out.println("user");
        return "user";

    }
}
