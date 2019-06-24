package com.security.jwt.controller;

import com.security.jwt.model.JwtUser;
import com.security.jwt.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private final JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser){
        System.out.println(jwtUser.toString());
        return jwtGenerator.generate(jwtUser);
    }
}
