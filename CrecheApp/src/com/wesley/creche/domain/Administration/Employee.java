/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.Administration;

/**
 *
 * @author Wesleyjohn
 */
public class Employee {
    private int employeeID;
    private String name;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    private String lastName;

    public Employee() {
    }
    private String email;

    public Employee(int employeeID, String name, String lastName, String email, String contact, String address, String hireDate, String accountNumber) {
        this.employeeID = employeeID;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.hireDate = hireDate;
        this.accountNumber = accountNumber;
    }
    private String contact;
    private String address;
    private String hireDate;
    private String accountNumber;
}
