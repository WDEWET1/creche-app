/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.EmployeeService;

/**
 *
 * @author Wesleyjohn
 */
public interface Employee_Interface {
    public Qualifications getQualifications();
    public Work_Experience getWorkExperience();
    public Remuneration getRemuneration();
    public Leave getLeaveDays();
    
    public Qualifications setQualifications(Qualifications qualifications);
    public Work_Experience setWorkExperience(Work_Experience workExperience);
    public Remuneration setRemuneration(Remuneration remuneration);
    public Leave setLeaveDays(Leave leave);
}
