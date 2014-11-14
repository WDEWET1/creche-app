/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services.LoginService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Wesleyjohn
 */
public class Encryption {
    
    public String encrypt(String password) throws NoSuchAlgorithmException, FileNotFoundException{
        
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        
        byte[] byteData = md.digest();
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i <byteData.length; i++){
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println("Digest in hex format: "+sb.toString());
        
        //convert to hex format
        StringBuffer hexString = new StringBuffer();
        for(int i = 0; i < byteData.length; i++){
            String hex = Integer.toHexString(0xff & byteData[i]);
            if(hex.length()==1){
                hexString.append('0');
            }
            hexString.append(hex);
        }
        System.out.println("Digest in hex format: "+hexString.toString());
        
        return hexString.toString();
    }
}
