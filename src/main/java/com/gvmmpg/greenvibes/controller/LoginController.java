package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/login")
public class LoginController {

    @GetMapping
    public String loginUser() {
        return "main/public/login";
    }

}
