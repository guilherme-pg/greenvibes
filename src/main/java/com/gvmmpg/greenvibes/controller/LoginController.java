package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.configuration.security.DataTokenJWT;
import com.gvmmpg.greenvibes.configuration.security.TokenService;
import com.gvmmpg.greenvibes.domain.user.DataAuthentication;
import com.gvmmpg.greenvibes.domain.user.User;
import com.gvmmpg.greenvibes.domain.user.UserRegister;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/public/login")
public class LoginController {

    @GetMapping
    public String loginUser() {
        return "main/public/login";
    }
}
