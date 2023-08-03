package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.domain.user.User;
import com.gvmmpg.greenvibes.domain.user.UserRegister;
import com.gvmmpg.greenvibes.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



@Controller
@RequestMapping("/public/userRegister")
public class UserRegisterController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String loadUserRegister() {
        return "main/public/userRegister";
    }

    @PostMapping("/user-register")
    public String registerUser(@ModelAttribute UserRegister data) {
        try {
            var user = new User(data);
            // Check if the email already exists
            // boolean exists = userRepository.existsByAnotherPropertyName(user.getUser_login());
            // if (exists) {return "redirect:/register?error=email-exists";}

            String plainPassword = user.getPassword();
            String encodedPassword = passwordEncoder.encode(plainPassword);
            user.setPassword(encodedPassword);

            userRepository.save(user);

            return "redirect:/public/home";}

        catch (Exception e) {
            System.out.println(e);
            return "redirect:/public/errorPage";}
    }
}
