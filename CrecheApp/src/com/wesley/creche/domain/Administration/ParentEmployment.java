/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.Administration;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Wesleyjohn
 */
@Entity
public class ParentEmployment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public ParentEmployment() {
    }

    public String getEmployer_name() {
        return employer_name;
    }

    public void setEmployer_name(String employer_name) {
        this.employer_name = employer_name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearsAtCurrentEmployer() {
        return yearsAtCurrentEmployer;
    }

    public void setYearsAtCurrentEmployer(int yearsAtCurrentEmployer) {
        this.yearsAtCurrentEmployer = yearsAtCurrentEmployer;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public String getWork_contactNumber() {
        return work_contactNumber;
    }

    public void setWork_contactNumber(String work_contactNumber) {
        this.work_contactNumber = work_contactNumber;
    }

    public String getWork_address() {
        return work_address;
    }

    public void setWork_address(String work_address) {
        this.work_address = work_address;
    }
    private String employer_name;
    private String jobTitle;

    public ParentEmployment(Long id, String employer_name, String jobTitle, int yearsAtCurrentEmployer, boolean permanent, String work_contactNumber, String work_address) {
        this.id = id;
        this.employer_name = employer_name;
        this.jobTitle = jobTitle;
        this.yearsAtCurrentEmployer = yearsAtCurrentEmployer;
        this.permanent = permanent;
        this.work_contactNumber = work_contactNumber;
        this.work_address = work_address;
    }
    private int yearsAtCurrentEmployer;
    private boolean permanent;
    private String work_contactNumber;
    private String work_address;
    
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
        if (!(object instanceof ParentEmployment)) {
            return false;
        }
        ParentEmployment other = (ParentEmployment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wesley.creche.domain.ParentEmployment[ id=" + id + " ]";
    }
    
}
