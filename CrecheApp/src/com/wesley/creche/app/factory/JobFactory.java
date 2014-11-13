/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.app.factory;

import com.wesley.creche.domain.Administration.Job;

/**
 *
 * @author Wesleyjohn
 */
public class JobFactory {
    public Job getJob(int jobID, String jobTitle, double minSal, double maxSal){
        
        Job job = new Job();
        job.setJobID(jobID);
        job.setJobTitle(jobTitle);
        job.setMinSalary(minSal);
        job.setMaxSalary(maxSal);
        return job;
    }
}
