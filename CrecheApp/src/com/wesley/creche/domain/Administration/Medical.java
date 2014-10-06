/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.Administration;

import java.io.Serializable;

/**
 *
 * @author Wesleyjohn
 */
public class Medical implements Serializable{
    private String ID;
    private boolean disability;
    private boolean foodAllergies;
    private String Allergy_name;

    public String getID() {
        return ID;
    }

    public Medical(String ID, boolean disability, boolean foodAllergies, String Allergy_name, String disability_name, String doctor_name, String doctor_emergency_number) {
        this.ID = ID;
        this.disability = disability;
        this.foodAllergies = foodAllergies;
        this.Allergy_name = Allergy_name;
        this.disability_name = disability_name;
        this.doctor_name = doctor_name;
        this.doctor_emergency_number = doctor_emergency_number;
    }

    public boolean isFoodAllergies() {
        return foodAllergies;
    }

    public void setFoodAllergies(boolean foodAllergies) {
        this.foodAllergies = foodAllergies;
    }

    public String getAllergy_name() {
        return Allergy_name;
    }

    public void setAllergy_name(String Allergy_name) {
        this.Allergy_name = Allergy_name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isDisability() {
        return disability;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    public String getDisability_name() {
        return disability_name;
    }

    public void setDisability_name(String disability_name) {
        this.disability_name = disability_name;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_emergency_number() {
        return doctor_emergency_number;
    }

    public void setDoctor_emergency_number(String doctor_emergency_number) {
        this.doctor_emergency_number = doctor_emergency_number;
    }
    private String disability_name;
    private String doctor_name;
    private String doctor_emergency_number;
}
