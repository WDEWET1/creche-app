/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.app.factory;

import com.wesley.creche.domain.Administration.Employee;

/**
 *
 * @author Wesleyjohn
 */
public class EmployeeFactory {
    
    public Employee getEmployee(int empID, String name, String lastName, String email, String contact, String address, String hireDate, String accNumber){
        
        Employee employee = new Employee();
        employee.setEmployeeID(empID);
        employee.setName(name);
        employee.setLastName(lastName);
        employee.setEmail(email);
        employee.setContact(contact);
        employee.setAddress(address);
        employee.setHireDate(hireDate);
        employee.setAccountNumber(accNumber);
        
        
        return employee;
    }
}
