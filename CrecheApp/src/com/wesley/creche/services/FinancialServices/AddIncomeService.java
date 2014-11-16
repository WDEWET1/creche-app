/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.FinancialServices;

import com.wesley.creche.services.DatabaseConnectionService.ConnectDatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TaswellSalie
 */
public class AddIncomeService {
    public void addIncome(String descrip, String date, double amount) throws SQLException, ClassNotFoundException{
        ConnectDatabase connect = new ConnectDatabase();
        try {
        Connection con = connect.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "INSERT INTO income(description,date_received,amount) VALUES ('"+descrip+"', '"+date+"', "+amount+")";
        
       stmt.executeUpdate(sql);
       
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
  
}
