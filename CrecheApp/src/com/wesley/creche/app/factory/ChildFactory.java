/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.app.factory;

import com.wesley.creche.domain.Administration.Child;

/**
 *
 * @author Wesleyjohn
 */
public class ChildFactory {
    
    public Child getChild(int childID, String name, String lastName, String idNumber , String medical, String grade, String date) {
        
        Child child = new Child();

        //HERE WE CAN USE THE SINGLTON PATTERN
        //BECAUSE THIS CLASS ONLY GETS ONE OBJECT AT A TIME.
        
        //THIS CLASS'S ONLY JOB IS TO PUT THE VARIABLE 
        //FROM THE FORM INTO THE DOMAIN/ MODEL
        
        child.setChildID(childID);
        child.setName(name);
        child.setLastName(lastName);
        child.setIdNumber(idNumber);
        child.setMedicalConditions(medical);
        child.setGrade(grade);
        child.setDob(date);
        
        //HERE WE RETURN THE NEW CHILD CLASS, FILLED WITH VARIABLES(FROM FORM)
        //TO THE METHOD THAT CALLED IT, WHEN IT IS RETURNED,
        //THIS CHILD OBJECT BECOMES A PARAMTER THAT IS SENT TO THE SERVICE
        //THAT PUTS IT IN THE DATABASE
        return child;
    }
}
