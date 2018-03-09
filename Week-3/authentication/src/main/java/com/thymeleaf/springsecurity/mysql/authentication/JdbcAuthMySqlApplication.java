/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thymeleaf.springsecurity.mysql.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author UF-ChaiWaiBin
 */
@SpringBootApplication
public class JdbcAuthMySqlApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(JdbcAuthMySqlApplication.class, args);
    }
    
}
