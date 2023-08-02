package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/errorPage")
public class ErrorPageController {

    @GetMapping
    public String loadErrorPage() {
        return "main/public/errorPage";
    }
}
