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
public class Progress {
     private int reading;
     private int phonics;
     private int spelling;                     

    public Progress() {
    }

    public int getReading() {
        return reading;
    }

    public void setReading(int reading) {
        this.reading = reading;
    }

    public int getPhonics() {
        return phonics;
    }

    public void setPhonics(int phonics) {
        this.phonics = phonics;
    }

    public int getSpelling() {
        return spelling;
    }

    public void setSpelling(int spelling) {
        this.spelling = spelling;
    }

    public int getObedience() {
        return obedience;
    }

    public void setObedience(int obedience) {
        this.obedience = obedience;
    }

    public int getArithmetic() {
        return arithmetic;
    }

    public void setArithmetic(int arithmetic) {
        this.arithmetic = arithmetic;
    }

    public int getAttitude() {
        return attitude;
    }

    public void setAttitude(int attitude) {
        this.attitude = attitude;
    }

    public int getHomework() {
        return homework;
    }

    public void setHomework(int homework) {
        this.homework = homework;
    }

    public Progress(int reading, int phonics, int spelling, int obedience, int arithmetic, int attitude, int homework) {
        this.reading = reading;
        this.phonics = phonics;
        this.spelling = spelling;
        this.obedience = obedience;
        this.arithmetic = arithmetic;
        this.attitude = attitude;
        this.homework = homework;
    }
     private int obedience;
     private int arithmetic;
     private int attitude;
     private int homework;
}
