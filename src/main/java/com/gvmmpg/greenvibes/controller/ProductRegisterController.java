package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.domain.product.Product;
import com.gvmmpg.greenvibes.domain.product.ProductRegister;
import com.gvmmpg.greenvibes.domain.product.ProductRepository;
import com.gvmmpg.greenvibes.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Blob;

@Controller
@RequestMapping("/productRegister")
public class ProductRegisterController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String loadProductRegister() {
        return "main/productRegister";
    }

    @PostMapping("/product-register")
    public String registerProduct(@ModelAttribute ProductRegister data) {
        System.out.println(data);

        var product = new Product(data);
        System.out.println(product);

        return "redirect:/productRegister";
    }
}
