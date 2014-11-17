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
public class Emergency {
    private String police;
    private String ambulance;

    public Emergency() {
    }

    public String getPolice() {
        return police;
    }

    public void setPolice(String police) {
        this.police = police;
    }

    public String getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(String ambulance) {
        this.ambulance = ambulance;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public Emergency(String police, String ambulance, String fire) {
        this.police = police;
        this.ambulance = ambulance;
        this.fire = fire;
    }
    private String fire;
}
