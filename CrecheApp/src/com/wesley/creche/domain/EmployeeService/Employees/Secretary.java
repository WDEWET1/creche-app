/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.EmployeeService.Employees;

import com.wesley.creche.domain.Administration.Address;
import com.wesley.creche.domain.Administration.Contact;
import com.wesley.creche.domain.Administration.Demographics;
import com.wesley.creche.domain.Administration.Person;
import com.wesley.creche.domain.EmployeeService.Employee_Interface;
import com.wesley.creche.domain.EmployeeService.Leave;
import com.wesley.creche.domain.EmployeeService.Qualifications;
import com.wesley.creche.domain.EmployeeService.Remuneration;
import com.wesley.creche.domain.EmployeeService.Work_Experience;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Wesleyjohn
 */
@Entity
public class Secretary implements Serializable,Person,Employee_Interface {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Embedded
    private Contact contact;
    @Embedded
    private Address address;
    @Embedded
    private Demographics demographics;
    @Embedded
    private Leave leaveDays;
    @Embedded
    private Remuneration remuneration;
    @Embedded
    private Work_Experience workExperience;
    @Embedded
    private Qualifications qualifications;

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
        if (!(object instanceof Secretary)) {
            return false;
        }
        Secretary other = (Secretary) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wesley.creche.domain.EmployeeService.Employees.Secretary[ id=" + id + " ]";
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

    @Override
    public Qualifications getQualifications() {
        return this.qualifications;
    }

    @Override
    public Work_Experience getWorkExperience() {
        return this.workExperience;
    }

    @Override
    public Remuneration getRemuneration() {
        return this.remuneration;
    }

    @Override
    public Qualifications setQualifications(Qualifications qualifications) {
        return this.qualifications = qualifications;
    }

    @Override
    public Work_Experience setWorkExperience(Work_Experience workExperience) {
        return this.workExperience = workExperience;
    }

    @Override
    public Remuneration setRemuneration(Remuneration remuneration) {
        return this.remuneration = remuneration;
    }

    @Override
    public Leave getLeaveDays() {
        return this.leaveDays;
    }

    @Override
    public Leave setLeaveDays(Leave leave) {
        return this.leaveDays = leave;
    }
}
