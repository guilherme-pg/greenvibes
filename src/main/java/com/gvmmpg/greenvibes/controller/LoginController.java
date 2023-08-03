package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.configuration.security.DataTokenJWT;
import com.gvmmpg.greenvibes.configuration.security.TokenService;
import com.gvmmpg.greenvibes.domain.user.DataAuthenticaion;
import com.gvmmpg.greenvibes.domain.user.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/login")
public class LoginController {

    @GetMapping
    public String loginUser() {
        return "main/public/login";
    }

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity performLogin(@RequestBody @Valid DataAuthenticaion data) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var authentication = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.generateToken((User) authentication.getPrincipal());

        return ResponseEntity.ok(new DataTokenJWT(tokenJWT));
        // public String login() {return "main/public/home";}
    }


}
