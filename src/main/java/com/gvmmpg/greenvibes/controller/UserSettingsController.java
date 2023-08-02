package com.gvmmpg.greenvibes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private/userSettings")
public class UserSettingsController {

    @GetMapping
    public String loadUserSettings() {
        return "main/private/userSettings";
    }
}
