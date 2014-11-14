/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.app.factory;

import com.wesley.creche.domain.Administration.User;

/**
 *
 * @author Wesleyjohn
 */
public class UserFactory {
    public User getUser(String username, String encryptedPassword){
        User u = new User();
        
        u.setUsername(username);
        u.setPassword(encryptedPassword);
        
        return u;
    }
}
