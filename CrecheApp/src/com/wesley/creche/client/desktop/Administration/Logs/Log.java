/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.client.desktop.Administration.Logs;

import com.wesley.creche.domain.Administration.User;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

/**
 *
 * @author Wesleyjohn
 */
public class Log {
    
    public void log(String info, User user){
        
        GregorianCalendar date = new GregorianCalendar();
        
        try
        {
            String filename= "CrecheManagement - Logs.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write("\r\n"+"On "+date.getTime()+", User: "+user.getUsername().toUpperCase()+"\r\n   "+info);//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
