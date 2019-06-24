package com.security.first.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/home")
    public String home(){
        return "hello";
    }

    @RequestMapping(path = "/login")
    public String login(){
        return "lnsfnswvsnv";
    }

    @RequestMapping(path = "/logout")
    public String logout(){
        return "logout";
    }
}
