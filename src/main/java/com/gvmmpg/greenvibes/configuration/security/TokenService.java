package com.gvmmpg.greenvibes.configuration.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.gvmmpg.greenvibes.domain.user.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String generateToken(User user) {
        try {
            var algorithm = Algorithm.HMAC256(secret);
            var tokenPROV = JWT.create()
                    .withIssuer("API greenvibes.gvmmpg")
                    .withSubject(user.getLogin())
                    .withExpiresAt(dateExpiration())
                    .sign(algorithm);

             return tokenPROV;
        } catch (JWTCreationException exception){
            throw new RuntimeException("Error in jwt token generation", exception);
        }
    }

    public String getSubject(String tokenJWT) {
        try {
            var algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("greenvibes gvmmpg")
                    .build()
                    .verify(tokenJWT)
                    .getSubject();
        } catch (JWTVerificationException exception) {
            throw new RuntimeException("Token JWT invalid or expired!");
        }
    }

    private Instant dateExpiration() {
        return LocalDateTime.now().plusHours(16).toInstant(ZoneOffset.of("-03:00"));
    }
}
