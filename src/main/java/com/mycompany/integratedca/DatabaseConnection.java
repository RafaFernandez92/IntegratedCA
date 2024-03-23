/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integratedca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class DatabaseConnection {
    
     public static void main(String[] args) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cms","admin","java");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from emp");  
            while(rs.next()) { 
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                con.close();} 
        }catch(Exception e){ System.out.println(e);}  
    
    } 
}
