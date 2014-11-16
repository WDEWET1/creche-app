/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.FinancialServices;

import com.wesley.creche.domain.Finance.Income;
import com.wesley.creche.services.DatabaseConnectionService.ConnectDatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author TaswellSalie
 */
public class GetIncomeService {
    
    
    public ArrayList getIncomeList() throws ClassNotFoundException, SQLException{
        ArrayList<Income> incomeList = new ArrayList<>();
        Income incomeObject = null;
        
        ConnectDatabase connect = new ConnectDatabase();
        Connection con = connect.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT  income_id, description, date_received, amount FROM income";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next())
            {
                incomeObject = new Income();
                incomeObject.setIncome_id(Integer.parseInt(rs.getString(1)));
                incomeObject.setDesc(rs.getString(2));
                incomeObject.setDate(rs.getString(3));
                incomeObject.setAmount(Double.parseDouble(rs.getString(4)));
                
                incomeList.add(incomeObject);
                
            }
       return incomeList;
    }
    
    public ArrayList getIncomeByMonthAndYear(String month, String year) throws ClassNotFoundException, SQLException{
        ArrayList<Income> incomeList = getIncomeList();
        ArrayList<Income> incomeListByMonth = new ArrayList<>();
        
        String monthNumber = getMonthNumber(month);
        String monthFromArr = null;
        String yearFromArr = null;
        
        for(int i=0; i < incomeList.size(); i++ ){
            monthFromArr = incomeList.get(i).getDate().substring(5, 7);
            yearFromArr = incomeList.get(i).getDate().substring(0, 4);
            //System.out.println(monthFromArr);
            if(monthFromArr.equals(monthNumber)){
                if(yearFromArr.equals(year)){
                incomeListByMonth.add(incomeList.get(i));    
                }               
            }
        }
        
        return incomeListByMonth;
    }
    
    public static String getMonthNumber(String monthName){
        
        String monthNumber = null;
        
        switch(monthName) {
            case "January" : monthNumber = "01";
                break;
            case "February" : monthNumber = "02";
                break;
            case "March" : monthNumber = "03";
                break;
            case "April" : monthNumber = "04";
                break;
            case "May" : monthNumber = "05";
                break;
            case "June" : monthNumber = "06";
                break;
            case "July" : monthNumber = "07";
                break;
            case "August" : monthNumber = "08";
                break;
            case "September" : monthNumber = "09";
                break;
            case "October" : monthNumber = "10";
                break;
            case "November" : monthNumber = "11";
                break;
            case "December" : monthNumber = "12";
                break;
        }
        
        return monthNumber;
    }
    /*
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
        ArrayList<Income> in = getIncomeByMonthAndYear("August", "2014");
        
        for(int i = 0; i < in.size(); i++){
            System.out.println(in.get(i).getIncome_id()+" "+in.get(i).getDesc()+" "+in.get(i).getDate());
        }        
    }
               */
}
