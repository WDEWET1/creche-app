/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services.AdministrationServices;

/**
 *
 * @author Wesleyjohn
 */
public class DetermineGrade {

    public String getGrade(String year) {
        
        String grade = null;
        
        switch(year){
            case "2007":
                grade = "7";
                break;
            case "2008":
                grade = "6";
                break;
            case "2009":
                grade = "5";
                break;
            case "2010":
                grade = "4";
                break;
            case "2011":
                grade = "3";
                break;
            case "2012":
                grade = "2";
                break;
            case "2013":
                grade = "1";
                break;
            default: 
                grade = "0";
                break;     
        }
        
        return grade;
    }
}
