/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services.createFolder;

import java.io.File;

/**
 *
 * @author KarstensC
 */
public class createFolder {
    
    File folderName1 = new File("c:\\creche");
    File folderName2 = new File("c:\\creche\\reports");
    
    public void createFolder() {
        try {
            if (!folderName1.exists()) {
                folderName1.mkdir();
                
                if (!folderName2.exists()) {
                    folderName2.mkdir();
                }
            }
        }
        catch (SecurityException ex) {
            System.out.println(ex);
        }
    }
}
