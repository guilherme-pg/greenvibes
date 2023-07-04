package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productRegister")
public class ProductRegisterController {

    @GetMapping
    public String loadProductRegister() {
        return "main/productRegister";
    }
}
