/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.boot.jdbc.mysql.controller;

import com.spring.boot.jdbc.mysql.model.Student;
import com.spring.boot.jdbc.mysql.repository.JdbcMysqlDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UF-ChaiWaiBin
 */
@RestController
public class JdbcMysqlController {
    
    @Autowired
    public JdbcMysqlDAO dao;
    
    @RequestMapping("/springbootds/students")
    public List<Student> studentInfo() {
        List<Student> student = dao.isData();
        return student;
    }
}
