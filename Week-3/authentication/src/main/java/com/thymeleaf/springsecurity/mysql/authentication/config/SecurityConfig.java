/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.thymeleaf.springsecurity.mysql.authentication.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author UF-ChaiWaiBin
 */
@Configuration
@EnableAutoConfiguration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws
            Exception {
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(
                "SELECT username, password, enabled FROM users WHERE "
                        + "username=?").authoritiesByUsernameQuery("SELECT "
                                + "username, role FROM user_roles WHERE "
                                + "username=?");
    }
    
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/","/home").permitAll()
                .antMatchers("/admin").hasRole("ADMIN").anyRequest()
                .authenticated().and().formLogin().loginPage("/login")
                .permitAll().and().logout().permitAll();
        http.exceptionHandling().accessDeniedPage("/403");
    }
}
