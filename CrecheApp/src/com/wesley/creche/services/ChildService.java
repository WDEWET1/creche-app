/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Wesleyjohn
 */
public class ChildService {
    
    public void insertChildData(String name, String lastName, String id1, String medical, Date d) throws ClassNotFoundException, SQLException{
        
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);

        String serverName = "localhost";
        String mydatabase = "creche";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

        String username = "root";
        String password = "";

        System.out.println("about to send to database"+name+lastName);
        int id = Integer.parseInt(id1);
        
        Connection connection = DriverManager.getConnection(url, username, password);
        
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO child (name, last_name, id_num, med_con) VALUES(?,?,?,?)");
        stmt.setString(1, name);
        stmt.setString(2, lastName);
        stmt.setString(3, id1);
        stmt.setString(4, medical);
        stmt.executeUpdate();
        
        stmt.close();
        
        System.out.println("sent to database");
    }
}
