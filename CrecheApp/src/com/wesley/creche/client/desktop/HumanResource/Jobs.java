/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.client.desktop.HumanResource;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author AdrianKainda
 */
@Entity
@Table(name = "jobs", catalog = "creche", schema = "")
@NamedQueries({
    @NamedQuery(name = "Jobs.findAll", query = "SELECT j FROM Jobs j"),
    @NamedQuery(name = "Jobs.findByJobId", query = "SELECT j FROM Jobs j WHERE j.jobId = :jobId"),
    @NamedQuery(name = "Jobs.findByJobTitle", query = "SELECT j FROM Jobs j WHERE j.jobTitle = :jobTitle"),
    @NamedQuery(name = "Jobs.findByMinSalary", query = "SELECT j FROM Jobs j WHERE j.minSalary = :minSalary"),
    @NamedQuery(name = "Jobs.findByMaxSalary", query = "SELECT j FROM Jobs j WHERE j.maxSalary = :maxSalary")})
public class Jobs implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "job_id")
    private Integer jobId;
    @Column(name = "job_title")
    private String jobTitle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "min_salary")
    private BigDecimal minSalary;
    @Column(name = "max_salary")
    private BigDecimal maxSalary;

    public Jobs() {
    }

    public Jobs(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        Integer oldJobId = this.jobId;
        this.jobId = jobId;
        changeSupport.firePropertyChange("jobId", oldJobId, jobId);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        String oldJobTitle = this.jobTitle;
        this.jobTitle = jobTitle;
        changeSupport.firePropertyChange("jobTitle", oldJobTitle, jobTitle);
    }

    public BigDecimal getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(BigDecimal minSalary) {
        BigDecimal oldMinSalary = this.minSalary;
        this.minSalary = minSalary;
        changeSupport.firePropertyChange("minSalary", oldMinSalary, minSalary);
    }

    public BigDecimal getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(BigDecimal maxSalary) {
        BigDecimal oldMaxSalary = this.maxSalary;
        this.maxSalary = maxSalary;
        changeSupport.firePropertyChange("maxSalary", oldMaxSalary, maxSalary);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobId != null ? jobId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jobs)) {
            return false;
        }
        Jobs other = (Jobs) object;
        if ((this.jobId == null && other.jobId != null) || (this.jobId != null && !this.jobId.equals(other.jobId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wesley.creche.client.desktop.HumanResource.Jobs[ jobId=" + jobId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
