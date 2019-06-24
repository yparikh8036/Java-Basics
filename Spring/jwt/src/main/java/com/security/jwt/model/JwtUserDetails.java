package com.security.jwt.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class JwtUserDetails implements UserDetails {
    private String userName;
    private String token;
    private Long id;
    private Collection<GrantedAuthority> grantedAuthorityList;

    public JwtUserDetails(String username, long id, String token, List<GrantedAuthority> grantedAuthorityList) {
        this.userName = username;
        this.id = id;
        this.token = token;
        this.grantedAuthorityList = grantedAuthorityList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getUserName() {
        return userName;
    }

    public String getToken() {
        return token;
    }

    public Long getId() {
        return id;
    }

    public Collection<GrantedAuthority> getGrantedAuthorityList() {
        return grantedAuthorityList;
    }
}
