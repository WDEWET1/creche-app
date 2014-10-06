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
public class Leave implements Serializable{
    private String ID;
    private String sick_leave;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSick_leave() {
        return sick_leave;
    }

    public void setSick_leave(String sick_leave) {
        this.sick_leave = sick_leave;
    }

    public String getNormal_leave() {
        return normal_leave;
    }

    public void setNormal_leave(String normal_leave) {
        this.normal_leave = normal_leave;
    }

    public Leave(String ID, String sick_leave, String normal_leave) {
        this.ID = ID;
        this.sick_leave = sick_leave;
        this.normal_leave = normal_leave;
    }
    private String normal_leave;
}
