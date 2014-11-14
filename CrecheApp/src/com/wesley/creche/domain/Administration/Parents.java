/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.Administration;

/**
 *
 * @author Wesleyjohn
 */
public class Parents {
    private int parentID;
    private String fatherName;
    private String fatherLastName;
    private String fatherID; 
    private  String fatherOccupation; 

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getFatherID() {
        return fatherID;
    }

    public void setFatherID(String fatherID) {
        this.fatherID = fatherID;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public String getFatherContact() {
        return fatherContact;
    }

    public void setFatherContact(String fatherContact) {
        this.fatherContact = fatherContact;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getMotherID() {
        return motherID;
    }

    public void setMotherID(String motherID) {
        this.motherID = motherID;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public String getMotherContact() {
        return motherContact;
    }

    public void setMotherContact(String motherContact) {
        this.motherContact = motherContact;
    }

    public Parents() {
    }
    private String fatherContact; 

    public Parents(int parentID, String fatherName, String fatherLastName, String fatherID, String fatherOccupation, String fatherContact, String motherName, String motherLastName, String motherID, String motherOccupation, String motherContact) {
        this.parentID = parentID;
        this.fatherName = fatherName;
        this.fatherLastName = fatherLastName;
        this.fatherID = fatherID;
        this.fatherOccupation = fatherOccupation;
        this.fatherContact = fatherContact;
        this.motherName = motherName;
        this.motherLastName = motherLastName;
        this.motherID = motherID;
        this.motherOccupation = motherOccupation;
        this.motherContact = motherContact;
    }

    private String motherName; 
    private String motherLastName;
    private String motherID; 
    private String motherOccupation; 
    private String motherContact;
}
