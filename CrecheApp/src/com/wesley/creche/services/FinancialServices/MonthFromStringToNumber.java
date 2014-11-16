/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.FinancialServices;

/**
 *
 * @author TaswellSalie
 */
public class MonthFromStringToNumber {
    public String getMonthStringToNumber(String monthName){
        
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
}
