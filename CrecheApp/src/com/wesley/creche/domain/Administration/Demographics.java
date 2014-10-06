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
public class Demographics implements Serializable{
    private char gender;
    private char race;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getRace() {
        return race;
    }

    public void setRace(char race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Demographics(char gender, char race, int age, String religion) {
        this.gender = gender;
        this.race = race;
        this.age = age;
        this.religion = religion;
    }
    private int age;
    private String religion;
}
