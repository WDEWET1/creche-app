/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.Administration;

import com.wesley.creche.domain.EmployeeService.Employees.Teacher;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Wesleyjohn
 */
@Entity
public class Child implements Serializable {
    private String ID;
    private String name;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
    private char gender;
    private char race;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Teacher> teacher;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Parent parent;

    public Child() {
    }

    public Child(String ID, String name, Date dob, char gender, char race, List<Teacher> teacher, Parent parent, Medical medical, Long id) {
        this.ID = ID;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.race = race;
        this.teacher = teacher;
        this.parent = parent;
        this.medical = medical;
        this.id = id;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

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

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Medical medical;
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
        if (!(object instanceof Child)) {
            return false;
        }
        Child other = (Child) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wesley.creche.domain.Child[ id=" + id + " ]";
    }
    
}
