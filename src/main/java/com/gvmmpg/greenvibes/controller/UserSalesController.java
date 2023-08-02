package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private/userSales")
public class UserSalesController {

    @GetMapping
    public String loadUserSales() {
        return "main/private/userSales";
    }
}
