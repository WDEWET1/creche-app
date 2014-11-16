/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.client.desktop.Validation.ValidationCode;

/**
 *
 * @author TaswellSalie
 */
public class ValidationMethods {
    
    //Add validation code/Methods here
    
    public boolean checkIfDouble(String number){
        boolean check = false;
        try
        {
          Double.parseDouble(number);
          check = true;
        }
        catch(NumberFormatException e)
        {
          //not a double
            check = false;
        }
        return check;
    }
    
    
    public boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }       
    
    public boolean isSpecialSymbol(String text){
       
        //DOESN'T WORK!!
        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
     for (int i = 0; i < text.length(); i++) {
         if (specialChars.contains(text.substring(i, 1))) {
             return true;
         }
     }
    return false;
    }
    
    public boolean isDoubleNegative(String text){
       boolean check = false;
       Double amount = Double.parseDouble(text);
       
       if(amount < 0){
           check = true;
       }
       return check;
    }
    
    public boolean CheckIfConvertableToDouble(String text){
        boolean check = false;
        
        if(checkIfDouble(text)){
            if(!isDoubleNegative(text)){
                check =true;
            }            
        }
        
        return check;
    }
    
    
    
    
}
