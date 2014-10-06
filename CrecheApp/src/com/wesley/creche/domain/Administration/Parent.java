/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.Administration;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Wesleyjohn
 */
@Entity
public class Parent implements Serializable,Person {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ID;
    private String spouse_name;
    private String spouse_lastName;
    
    @Embedded
    private Address address;
    
    @Embedded
    private Contact contact;
    
    @Embedded
    private Demographics demographics;

    public Parent() {
    }

    public String getID() {
        return ID;
    }

    public Parent(Long id, String ID, String spouse_name, String spouse_lastName, String spouse_contactNumber, ParentEmployment parentEmployment) {
        this.id = id;
        this.ID = ID;
        this.spouse_name = spouse_name;
        this.spouse_lastName = spouse_lastName;
        this.spouse_contactNumber = spouse_contactNumber;
        this.parentEmployment = parentEmployment;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSpouse_name() {
        return spouse_name;
    }

    public void setSpouse_name(String spouse_name) {
        this.spouse_name = spouse_name;
    }

    public String getSpouse_lastName() {
        return spouse_lastName;
    }

    public void setSpouse_lastName(String spouse_lastName) {
        this.spouse_lastName = spouse_lastName;
    }

    public String getSpouse_contactNumber() {
        return spouse_contactNumber;
    }

    public void setSpouse_contactNumber(String spouse_contactNumber) {
        this.spouse_contactNumber = spouse_contactNumber;
    }

    public ParentEmployment getParentEmployment() {
        return parentEmployment;
    }

    public void setParentEmployment(ParentEmployment parentEmployment) {
        this.parentEmployment = parentEmployment;
    }
    private String spouse_contactNumber;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private ParentEmployment parentEmployment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parent)) {
            return false;
        }
        Parent other = (Parent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wesley.creche.domain.Parents[ id=" + id + " ]";
    }

    @Override
    public Contact getContact() {
        return this.contact;
    }

    @Override
    public Address getAddress() {
        return this.address;
    }

    @Override
    public Demographics getDemographics() {
        return this.demographics;
    }

    @Override
    public Contact setContact(Contact contact) {
        return this.contact = contact;
    }

    @Override
    public Address setAddress(Address address) {
        return this.address = address;
    }

    @Override
    public Demographics setDemographics(Demographics demographics) {
        return this.demographics = demographics;
    }
    
}
