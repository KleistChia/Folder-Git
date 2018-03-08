/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thymeleaf.springsecurity.mysql.authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author UF-ChaiWaiBin
 */
@Controller
public class AuthenticationController {
    
    @RequestMapping("/")
    public String home() {
        return "home";
    }
    
    @RequestMapping("/user")
    public String user() {
        return "user";
    }
    
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    
    @RequestMapping("/403")
    public String error403() {
        return "403";
    }
}
