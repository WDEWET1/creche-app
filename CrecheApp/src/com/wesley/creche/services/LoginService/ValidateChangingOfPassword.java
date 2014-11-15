/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services.LoginService;

import com.wesley.creche.services.SQLQueries;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wesleyjohn
 */
public class ValidateChangingOfPassword {
    
    public boolean checkNewAndVerified(String password1, String password2){
        return password1.equals(password2);
    }
    
    public boolean checkIfPasswordExists(String oldPassword){
        
        boolean check = false;
        String oldEncryptedPassword = null;
        
        Encryption e = new Encryption();
        try {
            oldEncryptedPassword = e.encrypt(oldPassword);
        } catch (NoSuchAlgorithmException | FileNotFoundException ex) {
            Logger.getLogger(ValidateChangingOfPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SQLQueries s = new SQLQueries();
        try {
            check = s.checkIfPasswordExists(oldEncryptedPassword);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ValidateChangingOfPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    
    public void updatePassword(String oldPassword, String newPassword){
        
        Encryption e = new Encryption();
        String newEncryptedPassword = null;
        String oldEncryptedPassword = null;
        try {
            oldEncryptedPassword = e.encrypt(oldPassword);
            newEncryptedPassword = e.encrypt(newPassword);
        } catch (NoSuchAlgorithmException | FileNotFoundException ex) {
            Logger.getLogger(ValidateChangingOfPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SQLQueries s = new SQLQueries();
        s.updatePassword(oldEncryptedPassword ,newEncryptedPassword);
    }
}
