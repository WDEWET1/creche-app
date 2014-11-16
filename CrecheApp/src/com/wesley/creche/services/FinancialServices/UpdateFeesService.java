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
public class UpdateFeesService {
    
    public void updateChildFees(double updatedAmount,int fees_id, double amountDue) throws SQLException, ClassNotFoundException{
        ConnectDatabase connect = new ConnectDatabase();
        Connection con = connect.getConnection();
        Statement stmt = con.createStatement();
        
        double amount = amountDue - updatedAmount;
        
        String update = "UPDATE fees set amount_due = "+amount+", status = \'Overdue\' WHERE fee_id = "+fees_id+"";
        stmt.executeUpdate(update);       
        
    }
}
