package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userRegister")
public class UserRegisterController {

    @GetMapping
    public String loadUserRegister() {
        return "main/userRegister";
    }
}
