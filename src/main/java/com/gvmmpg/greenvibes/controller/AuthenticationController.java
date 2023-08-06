package com.gvmmpg.greenvibes.controller;

import com.gvmmpg.greenvibes.configuration.security.DataTokenJWT;
import com.gvmmpg.greenvibes.configuration.security.TokenService;
import com.gvmmpg.greenvibes.domain.user.DataAuthentication;
import com.gvmmpg.greenvibes.domain.user.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/public/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/perform-login")
    public ResponseEntity performLogin(@RequestBody @Valid DataAuthentication data) {
        try {
            var authenticationToken = new UsernamePasswordAuthenticationToken(data.login(), data.password());
            var authentication = manager.authenticate(authenticationToken);

            var tokenJWT = tokenService.generateToken((User) authentication.getPrincipal());

            HttpHeaders headers = new HttpHeaders();
            headers.add("Location", "/home");

            return ResponseEntity.ok()
                    .headers(headers)
                    .body(new DataTokenJWT(tokenJWT));
            // return ResponseEntity.ok(new DataTokenJWT(tokenJWT));

        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Invalid login or password");
        }
    }
}
