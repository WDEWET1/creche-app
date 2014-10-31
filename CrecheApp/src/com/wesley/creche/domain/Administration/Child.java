/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.Administration;

import java.util.Date;

/**
 *
 * @author Wesleyjohn
 */
public class Child {
    private String name;
    private String lastName;
    private String IDNumber;

    public Child() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getChildID() {
        return childID;
    }

    public void setChildID(String childID) {
        this.childID = childID;
    }

    public String getMedicalConditions() {
        return medicalConditions;
    }

    public void setMedicalConditions(String medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    private String childID;
    private String medicalConditions;
    private Date dob;

    public Child(String name, String lastName, String IDNumber, String childID, String medicalConditions, Date dob) {
        this.name = name;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.childID = childID;
        this.medicalConditions = medicalConditions;
        this.dob = dob;
    }
}
