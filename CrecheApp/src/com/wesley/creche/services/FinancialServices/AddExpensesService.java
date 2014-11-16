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
public class AddExpensesService {
    public void addExpense(String descrip, String dateExpended, double amount) throws ClassNotFoundException, SQLException{
        ConnectDatabase connect = new ConnectDatabase();
        Connection con = connect.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "INSERT INTO expenses (description, date_paid, amount)" +
            "VALUES ("+descrip+", "+dateExpended+", "+amount+")";
        //stmt.executeUpdate(sql);
        try{
        stmt.executeUpdate(sql);
        }catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
