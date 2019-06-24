package com.security.jwt.model;

public class JwtUser {
    private String username;
    private long id;
    private String role;

    public void setUserName(String subject) {
        this.username = subject;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}
