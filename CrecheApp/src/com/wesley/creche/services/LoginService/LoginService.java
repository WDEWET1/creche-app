/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.LoginService;

/**
 *
 * @author TaswellSalie
 */
public class LoginService {
    
    public boolean getLogin(String uName, String pWord){
              
        //GET USERNAME AND PASSWORD FROM DATABASE
        String databaseUserName = "a";
        String databasePassword = "q";
        
        return uName.equals(databaseUserName) && pWord.equals(databasePassword);
    } 
}
