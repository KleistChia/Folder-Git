/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.boot.jdbc.mysql.repository;

import com.spring.boot.jdbc.mysql.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UF-ChaiWaiBin
 */
@Repository
public class JdbcMysqlDAO {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    private static final String SQL = "select * from student";
    
    public List<Student> isData() {
        List<Student> students = new ArrayList<Student>();
        List<Map<String,Object>> rows = jdbcTemplate.queryForList(SQL);
        
        for(Map<String,Object> row:rows) {
            Student student = new Student();
            student.setStudId((int)row.get("studId"));
            student.setStudName((String)row.get("studName"));
            student.setStudPass((String)row.get("studPass"));
            
            students.add(student);
        }
        
        return students;
    }
}
