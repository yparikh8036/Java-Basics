package com.security.jwt.security;

import com.security.jwt.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtVakidator {

    private String secret = "youtube";

    public JwtUser validate(String tokenString) {

        JwtUser jwtUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(tokenString)
                    .getBody();

            jwtUser = new JwtUser();
            jwtUser.setUserName(body.getSubject());
            jwtUser.setId(Long.parseLong((String) body.get("id")));
            jwtUser.setRole((String) body.get("role"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return jwtUser;
    }
}
