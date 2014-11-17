/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.client.desktop.HumanResource;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author AdrianKainda
 */
@Entity
@Table(name = "employees", catalog = "creche", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findByEmpId", query = "SELECT e FROM Employees e WHERE e.empId = :empId"),
    @NamedQuery(name = "Employees.findByJobId", query = "SELECT e FROM Employees e WHERE e.jobId = :jobId"),
    @NamedQuery(name = "Employees.findByName", query = "SELECT e FROM Employees e WHERE e.name = :name"),
    @NamedQuery(name = "Employees.findByLastName", query = "SELECT e FROM Employees e WHERE e.lastName = :lastName"),
    @NamedQuery(name = "Employees.findByEmail", query = "SELECT e FROM Employees e WHERE e.email = :email"),
    @NamedQuery(name = "Employees.findByPhNumber", query = "SELECT e FROM Employees e WHERE e.phNumber = :phNumber"),
    @NamedQuery(name = "Employees.findByAddress", query = "SELECT e FROM Employees e WHERE e.address = :address"),
    @NamedQuery(name = "Employees.findByHireDate", query = "SELECT e FROM Employees e WHERE e.hireDate = :hireDate"),
    @NamedQuery(name = "Employees.findByAccNumber", query = "SELECT e FROM Employees e WHERE e.accNumber = :accNumber")})
public class Employees implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_id")
    private Integer empId;
    @Basic(optional = false)
    @Column(name = "job_id")
    private int jobId;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "ph_number")
    private String phNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "hire_date")
    @Temporal(TemporalType.DATE)
    private Date hireDate;
    @Column(name = "acc_number")
    private String accNumber;

    public Employees() {
    }

    public Employees(Integer empId) {
        this.empId = empId;
    }

    public Employees(Integer empId, int jobId) {
        this.empId = empId;
        this.jobId = jobId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        Integer oldEmpId = this.empId;
        this.empId = empId;
        changeSupport.firePropertyChange("empId", oldEmpId, empId);
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        int oldJobId = this.jobId;
        this.jobId = jobId;
        changeSupport.firePropertyChange("jobId", oldJobId, jobId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        String oldPhNumber = this.phNumber;
        this.phNumber = phNumber;
        changeSupport.firePropertyChange("phNumber", oldPhNumber, phNumber);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        Date oldHireDate = this.hireDate;
        this.hireDate = hireDate;
        changeSupport.firePropertyChange("hireDate", oldHireDate, hireDate);
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        String oldAccNumber = this.accNumber;
        this.accNumber = accNumber;
        changeSupport.firePropertyChange("accNumber", oldAccNumber, accNumber);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wesley.creche.client.desktop.HumanResource.Employees[ empId=" + empId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
