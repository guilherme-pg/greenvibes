package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private/account")
public class AccountController {

    @GetMapping
    public String loadAccount() {
        return "main/private/account";
    }
}
