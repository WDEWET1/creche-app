/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.FinancialServices;

import com.wesley.creche.domain.Finance.Expense;
import com.wesley.creche.services.DatabaseConnectionService.ConnectDatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TaswellSalie
 */
public class GetExpensesService {
    
    public ArrayList getExpensesList() throws ClassNotFoundException, SQLException{
        ArrayList<Expense> expenseList = new ArrayList<>();
        Expense expenseObject = null;
        
        ConnectDatabase connect = new ConnectDatabase();
        Connection con = connect.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT  expense_id, description, date_paid, amount FROM expenses";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next())
            {
                expenseObject = new Expense();
                expenseObject.setExpense_id(Integer.parseInt(rs.getString(1)));
                expenseObject.setDesc(rs.getString(2));
                expenseObject.setDate(rs.getString(3));
                expenseObject.setAmount(Double.parseDouble(rs.getString(4)));
                
                expenseList.add(expenseObject);
            }
        
        return expenseList;        
    }
    
    
    public ArrayList getExpenseListByMonthAndYear(String month, String year) throws ClassNotFoundException, SQLException{
        ArrayList<Expense> expenseList = getExpensesList();
        ArrayList<Expense> expenseListbymonth = new ArrayList<>();
        MonthFromStringToNumber monthToNumber = new MonthFromStringToNumber();
        String monthNumber = monthToNumber.getMonthStringToNumber(month);
        
        String monthFromArr = null;
        String yearFromArr = null;
        
        for(int i = 0; i < expenseList.size(); i++){
            monthFromArr = expenseList.get(i).getDate().substring(5, 7);
            yearFromArr = expenseList.get(i).getDate().substring(0, 4);
            
            if(monthFromArr.equals(monthNumber)){
                if(yearFromArr.equals(year)){
                    expenseListbymonth.add(expenseList.get(i));
                }
            }
        }  
        return expenseListbymonth;
    }
    /*
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ArrayList<Expense> expenseListByMonth = getExpenseListByMonthAndYear("November", "2014");    
       
        for(int i = 0; i <expenseListByMonth.size(); i++){
            System.out.println(expenseListByMonth.get(i).getExpense_id()+" "+expenseListByMonth.get(i).getDesc());
        }
        
    }
    */
}
