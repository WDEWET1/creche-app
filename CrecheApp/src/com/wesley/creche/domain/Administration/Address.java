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
public class Address implements Serializable{
    private String postalAddress;

    public Address(String postalAddress, String physicalAddress) {
        this.postalAddress = postalAddress;
        this.physicalAddress = physicalAddress;
    }
    private String physicalAddress;

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }
}
