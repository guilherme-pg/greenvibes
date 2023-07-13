package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productPage")
public class ProductPageController {

    @GetMapping
    public String loadProductPage() {
        return "main/productPage";
    }

    // REQUIRE: ADD TO THE CART
}
