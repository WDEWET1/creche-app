/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.app.factory;

import com.wesley.creche.domain.Administration.Parents;

/**
 *
 * @author Wesleyjohn
 */
public class ParentFactory {
    public Parents getParent(int parentID, String fatherName, String fatherLastName, String fatherID, String fatherOccupation, String fatherContact, 
                            String motherName, String motherLastName, String motherID, String motherOccupation, String motherContact){
        
        Parents parent = new Parents();
        
        parent.setParentID(parentID);
        
        parent.setFatherName(fatherName);
        parent.setFatherLastName(fatherLastName);
        parent.setFatherID(fatherID);
        parent.setFatherOccupation(fatherOccupation);
        parent.setFatherContact(fatherContact);
        
        parent.setMotherName(motherName);
        parent.setMotherLastName(motherLastName);
        parent.setMotherID(motherID);
        parent.setMotherOccupation(motherOccupation);
        parent.setMotherContact(motherContact);
        
        return parent;
    }
}
