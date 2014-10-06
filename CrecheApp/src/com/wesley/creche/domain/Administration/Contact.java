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
public class Contact implements Serializable{
    private String homeNumber;
    private String cellNumber;

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public Contact(String homeNumber, String cellNumber, String emergencyNumber, String emailAddress, String fax) {
        this.homeNumber = homeNumber;
        this.cellNumber = cellNumber;
        this.emergencyNumber = emergencyNumber;
        this.emailAddress = emailAddress;
        this.fax = fax;
    }
    private String emergencyNumber;

    public String getHomeNumber() {
        return homeNumber;
    }

    public Contact(String homeNumber, String cellNumber, String emailAddress, String fax) {
        this.homeNumber = homeNumber;
        this.cellNumber = cellNumber;
        this.emailAddress = emailAddress;
        this.fax = fax;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    private String emailAddress;
    private String fax;
}
