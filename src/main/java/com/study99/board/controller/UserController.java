package com.study99.board.controller;

import com.study99.board.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/register")
    public String registerForm(){
        return "register";
    }


    @GetMapping("/login")
    public String loginForm(){
        return "index";
    }

}
