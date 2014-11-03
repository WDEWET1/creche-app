/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.app.factory;

import com.wesley.creche.domain.Administration.Child;
import java.util.Date;

/**
 *
 * @author Wesleyjohn
 */
public class ChildFactory {
    
    public static Child getChild(String name, String lastName, String idNumber, String medical, Date d) {
        
        Child child = new Child();
        
        //here we going to use the SINGLETON creational pattern
        
        child.setName(name);
        child.setLastName(lastName);
        child.setIDNumber(idNumber);
        child.setMedicalConditions(medical);
        child.setDob(d);
        
        System.out.println("in factory");
        
        return child;
    }
}
