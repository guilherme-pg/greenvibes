package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.domain.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/productPage")
public class ProductPageController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public String loadProductPage() {
        return "main/public/productPage";
    }

    // @GetMapping
    // public String loadProducts(Model model) {
    //    model.addAttribute("Lista", repository.findAll());
    //    return "main/productPage";}

    // REQUIRE: ADD TO THE CART
}
