package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.domain.user.User;
import com.gvmmpg.greenvibes.domain.user.UserRegister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userRegister")
public class UserRegisterController {

    @GetMapping
    public String loadUserRegister() {
        return "main/userRegister";
    }

    @PostMapping("/user-register")
    public String registerUser(UserRegister data) {
        System.out.println("data -================>>>>>>>>>>>>> " + data);
        var user = new User(data);
        System.out.println("POST POST POST POST POST POST POST POST POST POST POST POST POST POST POST POST POST");
        System.out.println(user);
        return "redirect:/account";
    }
}
