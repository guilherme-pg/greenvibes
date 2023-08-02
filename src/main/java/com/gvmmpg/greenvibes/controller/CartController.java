package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/cart")
public class CartController {

    @GetMapping
    public String loadCart() {
        return "main/public/cart";
    }
}
