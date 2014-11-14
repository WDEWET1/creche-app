/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services.AdministrationServices;

import com.wesley.creche.domain.Administration.Child;
import com.wesley.creche.domain.Administration.Parents;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Wesleyjohn
 */
public class ChildService {
    
    public void insertChildData(Child child, Parents parent) throws ClassNotFoundException, SQLException{
        
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);
        String serverName = "localhost";
        String mydatabase = "creche";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("ABOUT TO SEND TO DATABASE  ----> "+child.getName()+" "+child.getLastName());
        
        
        
        //WHEN THIS SERVICE IS CALLED, IT MEANS THAT VARIABLES WERE
        //INPUTTED FROM THE USER, WE SENT THEM TO THE FACTORY
        //THE FACTORY INITIALIZED THE MODEL WITH THE VALUES WE GOT
        //FROM THE USER, THE NEWLY CREATED CHILD MODEL WAS RETURNED TO
        //THE FORM, WHERE THE SERVICE WAS CALLED WITH THE OBJECT AS ITS PARAMETER
        //AS YOU CAN SEE IN THE METHOD HEADING.
        
        //FROM THERE WE GET ALL THE VARIABLE FROM THE MODEL AS YOU CAN SEE BELOW
        
        System.out.println("PARENT ID ----------------------->" +parent.getParentID());
        
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO child (name, last_name, id_num, med_con, grade, dob, parent_id) VALUES(?,?,?,?,?,?,?)");
        stmt.setString(1, child.getName());
        stmt.setString(2, child.getLastName());
        stmt.setString(3, child.getIdNumber());
        stmt.setString(4, child.getMedicalConditions());
        stmt.setString(5, child.getGrade());
        stmt.setString(6, child.getDob());
        stmt.setInt(7, parent.getParentID());
        stmt.executeUpdate();
        stmt.close();

        
        
        
        
        
        System.out.println("INSERTED INTO DATABASE SUCESSFULLY.");
    }
}
