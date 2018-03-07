/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.boot.jdbc.mysql.model;

/**
 *
 * @author UF-ChaiWaiBin
 */
public class Student {
    
    private int studId;
    private String studName;
    private String studPass;

    public Student() {
    }

    public Student(int studId, String studName, String studPass) {
        this.studId = studId;
        this.studName = studName;
        this.studPass = studPass;
    }

    public int getStudId() {
        return studId;
    }

    public String getStudName() {
        return studName;
    }

    public String getStudPass() {
        return studPass;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setStudPass(String studPass) {
        this.studPass = studPass;
    }
     
}
