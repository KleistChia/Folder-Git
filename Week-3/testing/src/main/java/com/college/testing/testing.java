/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.college.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author UF-ChaiWaiBin
 */
public class testing {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");//this for mysql
            //Class.forName("org.h2.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "collegedb", "root", "root");//this for mysql
            //conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            
            stmt = conn.createStatement();
            
            String query = "INSERT INTO customer VALUES (1, 'Kleist','Chia')";
            
            stmt.executeUpdate(query);
            
            query = "DROP TABLE Customer";
            
            //stmt.executeUpdate(query);
            stmt.close();
            conn.close();
            
        }catch(SQLException se){
            
            se.printStackTrace();
            
        }catch(Exception ex){
            
            ex.printStackTrace();
            
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
    }
    
}
