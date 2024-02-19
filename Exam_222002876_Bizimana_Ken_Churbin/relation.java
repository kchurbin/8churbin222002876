/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.xemacscode.demo;
import java.sql.*;

/**
 *
 * @author AMAZON
 */
public class relation {
    static final String DB_URL="jdbc:mysql://localhost/students";
    static final String USER="root";
    static final String PASS="";
    public static Connection communication(){
        Connection conn= null;
        try{
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }
        catch(Exception ex){
            System.out.println("error");
            return null;
        }
        
    }
    
}
