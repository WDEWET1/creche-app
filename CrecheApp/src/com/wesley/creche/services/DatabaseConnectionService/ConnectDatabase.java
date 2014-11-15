/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.DatabaseConnectionService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TaswellSalie
 */
public class ConnectDatabase {
       Connection connect  = null;
        
        public Connection getConnection() throws ClassNotFoundException, SQLException {
            if(connect == null){
                //System.out.println("in if");
                return createConnection(connect);
            }
            else{
                //System.out.println("in else");
                return connect;
            }
        
        }
        
        public Connection createConnection(Connection con) throws ClassNotFoundException, SQLException{
        
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);
        String serverName = "localhost";
        String mydatabase = "creche";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String username = "root";
        String password = "";   
        
        //Connection connection = DriverManager.getConnection(url, username, password);
           con = DriverManager.getConnection(url, username, password);
        return con;    
        }
}
