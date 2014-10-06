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
public class Remuneration implements Serializable{
    private String ID;
    private double ratePerHour;

    public Remuneration(String ID, double ratePerHour, double overtimeRate) {
        this.ID = ID;
        this.ratePerHour = ratePerHour;
        this.overtimeRate = overtimeRate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
    private double overtimeRate;
}
