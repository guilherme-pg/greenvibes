package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/userProducts")
public class UserProductsController {

    @GetMapping
    public String loadUserProducts() {
        return "main/public/userProducts";
    }
}
