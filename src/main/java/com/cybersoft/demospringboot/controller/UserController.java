package com.cybersoft.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("")
    public String user(){
        return "This is user page";
    }

    @GetMapping("/signin")
    public String userSignIn(){
        return "This is sign in page of user";
    }

    @GetMapping("/signup")
    public String userSignUp(){
        return "This is sign up page of user";
    }
}
