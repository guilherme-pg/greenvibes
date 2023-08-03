package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.domain.product.Product;
import com.gvmmpg.greenvibes.domain.product.ProductRegister;
import com.gvmmpg.greenvibes.domain.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Blob;

@Controller
@RequestMapping("/private/productRegister")
public class ProductRegisterController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String loadProductRegister() {
        return "main/private/productRegister";
    }

    @PostMapping("/private/product-register")
    public String registerProduct(@ModelAttribute ProductRegister data) {
        System.out.println(data);

        var product = new Product(data);
        System.out.println(product);

        return "redirect:/private/productRegister";
    }
}
