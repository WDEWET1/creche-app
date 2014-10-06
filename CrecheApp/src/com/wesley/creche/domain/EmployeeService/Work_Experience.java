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
public class Work_Experience implements Serializable{
    private String ID;
    private String PreviousEmployer;

    public String getID() {
        return ID;
    }

    public Work_Experience(String ID, String PreviousEmployer, int yearsAtPreviousEmployer, String jobTitleAtPreviousEmployer) {
        this.ID = ID;
        this.PreviousEmployer = PreviousEmployer;
        this.yearsAtPreviousEmployer = yearsAtPreviousEmployer;
        this.jobTitleAtPreviousEmployer = jobTitleAtPreviousEmployer;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPreviousEmployer() {
        return PreviousEmployer;
    }

    public void setPreviousEmployer(String PreviousEmployer) {
        this.PreviousEmployer = PreviousEmployer;
    }

    public int getYearsAtPreviousEmployer() {
        return yearsAtPreviousEmployer;
    }

    public void setYearsAtPreviousEmployer(int yearsAtPreviousEmployer) {
        this.yearsAtPreviousEmployer = yearsAtPreviousEmployer;
    }

    public String getJobTitleAtPreviousEmployer() {
        return jobTitleAtPreviousEmployer;
    }

    public void setJobTitleAtPreviousEmployer(String jobTitleAtPreviousEmployer) {
        this.jobTitleAtPreviousEmployer = jobTitleAtPreviousEmployer;
    }
    private int yearsAtPreviousEmployer;
    private String jobTitleAtPreviousEmployer;
}
