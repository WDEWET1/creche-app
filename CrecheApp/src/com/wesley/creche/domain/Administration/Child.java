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
public class Child {
    private String name;
    private String lastName;
    private String idNumber;
    private String grade;
    private String medicalConditions;
    private String dob;

    public String getName() {
        return name;
    }

    public Child() {
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMedicalConditions() {
        return medicalConditions;
    }

    public void setMedicalConditions(String medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getChildID() {
        return childID;
    }

    public void setChildID(int childID) {
        this.childID = childID;
    }

    public Child(String name, String lastName, String idNumber, String grade, String medicalConditions, String dob, int childID) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.grade = grade;
        this.medicalConditions = medicalConditions;
        this.dob = dob;
        this.childID = childID;
    }
    private int childID;
}
