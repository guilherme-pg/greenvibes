package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.domain.user.User;
import com.gvmmpg.greenvibes.domain.user.UserRegister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

@Controller
@RequestMapping("/userRegister")
public class UserRegisterController {

    @GetMapping
    public String loadUserRegister() {
        return "main/userRegister";
    }

    @PostMapping("/user-register")
    public String registerUser(@RequestPart("user_photo") MultipartFile user_photo, @RequestPart("user") UserRegister data) {
        System.out.println(data);
        var user = new User(data);

        if (user_photo != null && user_photo.getSize() > 0) {
            try {
                byte[] photoBytes = user_photo.getBytes();
                Blob photoBlob = new javax.sql.rowset.serial.SerialBlob(user_photo.getBytes());
                user.setUser_photo(photoBlob);

            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
            
        }

        return "redirect:/account";
    }
}
