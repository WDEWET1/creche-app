/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.EmployeeService;

import java.io.Serializable;

/**
 *
 * @author Wesleyjohn
 */
public class Qualifications implements Serializable{
    private String ID;
    private String nameOfQualification;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameOfQualification() {
        return nameOfQualification;
    }

    public void setNameOfQualification(String nameOfQualification) {
        this.nameOfQualification = nameOfQualification;
    }

    public int getNumberOfYearsAtInstitution() {
        return numberOfYearsAtInstitution;
    }

    public void setNumberOfYearsAtInstitution(int numberOfYearsAtInstitution) {
        this.numberOfYearsAtInstitution = numberOfYearsAtInstitution;
    }

    public int getNQF_level() {
        return NQF_level;
    }

    public void setNQF_level(int NQF_level) {
        this.NQF_level = NQF_level;
    }
    private int numberOfYearsAtInstitution;
    private int NQF_level;

    public Qualifications(String ID, String nameOfQualification, int numberOfYearsAtInstitution, int NQF_level) {
        this.ID = ID;
        this.nameOfQualification = nameOfQualification;
        this.numberOfYearsAtInstitution = numberOfYearsAtInstitution;
        this.NQF_level = NQF_level;
    }
}
