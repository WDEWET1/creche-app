/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KarstensC
 */
public class SQLQueries {
    
    //Method that creates a connection to the MySQL DB... 
    private static Connection getTheConnection() throws SQLException, ClassNotFoundException {
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);

        String serverName = "localhost";
        String mydatabase = "creche";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

        String username = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, username, password);
        return con;
    }
    
    //Insert record into Attendance Table....
    public void insertIntoAttendance(int id, String date, int absent) throws SQLException, ClassNotFoundException {
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO attendance ("
                    + "child_id, date, absent) "
                    + "VALUES ("
                    + id + ", "
                    + "'" + date + "', "
                    + absent
            + ")");
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Categories Table....
    public void insertIntoCategories(String name, String description) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO categories ("
                + "cat_name, description) "
                + "VALUES ("
                + "'" + name + "', "
                + "'" + description + "'"
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Child Table....
    public void insertIntoChild(String idNo, String name, String lastName,
    String dob, String medCondition, String startDate, String endDate,
    String grade, int parentID, int empID) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO Child ("
                + "id_num, name, last_name, dob, med_con, start_date, end_date, "
                + "grade, parent_id, emp_id) "
                + "VALUES ("
                + "'" + idNo + "', "
                + "'" + name + "', "
                + "'" + lastName + "', "
                + "'" + dob + "', "
                + "'" + medCondition + "', "
                + "'" + startDate + "', "
                + "'" + endDate + "', "
                + "'" + grade + "', "
                + parentID + ", "
                + empID
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Emergency Table....
    public void insertIntoEmergency(int ambulance, int police, int fire) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO emergency ("
                + "ambulance, police, fire) "
                + "VALUES ("
                + ambulance + ", "
                + police + ", "
                + fire
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Employees Table....
    public void insertIntoEmployees(int jobID, String name, String lastName, 
       String email, String phoneNo, String address, String hireDate,
       double salary) throws SQLException, ClassNotFoundException {
       try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO employees ("
                + "job_id, name, last_name, email, ph_number, address, hire_date, "
                + "salary) "
                + "VALUES ("
                + jobID + ", "
                + "'" + name + "', "
                + "'" + lastName + "', "
                + "'" + email + "', "
                + "'" + phoneNo + "', "
                + "'" + address + "', "
                + "'" + hireDate + "', "
                + salary
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Fees Table....
    public void insertIntoFees(int childID, double amountDue, String status, double total) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO fees ("
                + "child_id, amount_due, status, total) "
                + "VALUES ("
                + childID + ", "
                + amountDue + ", "
                + "'" + status + "', "
                + total
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Jobs Table....
    public void insertIntoJobs(String jobTitle, double minSalary, double maxSalary) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO jobs ("
                + "job_title, min_salary, max_salary) "
                + "VALUES ("
                + "'" + jobTitle + "', "
                + minSalary + ", "
                + maxSalary
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Order Detail Table....
    public void insertIntoOrderDetail(int prodID, double unitPrice, int quantity, 
        int discount) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO order_details ("
                + "prod_id, unit_price, quantity, discount) "
                + "VALUES ("
                + prodID + ", "
                + unitPrice + ", "
                + quantity + ", "
                + discount
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Orders Table....
    public void insertIntoOrders(int empID, String date) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO orders ("
                + "emp_id, order_date) "
                + "VALUES ("
                + empID + ", "
                + "'" + date + "'"
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Parents Table....
    public void insertIntoParent(String fatherName, String fatherLastName, String fatherIDNumber, 
       String fatherOccupation, String motherName, String motherLastName, String motherIDNumber,
       String motherOccupation, int childID) throws SQLException, ClassNotFoundException {
       try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO parent ("
                + "father_name, father_last_name, father_ID_no, father_occupation,"
                + "mother_name, mother_last_name, mother_ID_no, mother_occupation, "
                + "child_id) "
                + "VALUES ("
                + "'" + fatherName + "', "
                + "'" + fatherLastName + "', "
                + "'" + fatherIDNumber + "', "
                + "'" + fatherOccupation + "', "
                + "'" + motherName + "', "
                + "'" + motherLastName + "', "
                + "'" + motherIDNumber + "', "
                + "'" + motherOccupation + "', "
                + childID
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Products Table....
    public void insertIntoProducts(int supplierID, int categoryID, int quantityUnit, 
        double unitPrice, int unitsInStock, String lastUpdateDate) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO products ("
                + "supplier_id, cat_id, quantity_per_unit, unit_price, "
                + "units_in_stock, last_date_update) "
                + "VALUES ("
                + supplierID + ", "
                + categoryID + ", "
                + quantityUnit + ", "
                + unitPrice + ", "
                + unitsInStock + ", "
                + "'" + lastUpdateDate + "'"
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Progress Table....
    public void insertIntoProgress(int childID, int reading, int phonics, int spelling,
        int obedience, int arithmetic, int attitude, int homework) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO progress ("
                + "child_id, reading, phonics, spelling, obedience, "
                + "arithmetic, attitude, homework) "
                + "VALUES ("
                + childID + ", "
                + reading + ", "
                + phonics + ", "
                + spelling + ", "
                + obedience + ", "
                + arithmetic + ", "
                + attitude + ", "
                + homework
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Insert record into Subject Table....
    public void insertIntoSubject(String subjectName, int childID) throws SQLException, ClassNotFoundException {
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO subject ("
                    + "subject_name, child_id) "
                    + "VALUES ("
                    + "'" + subjectName + "', "
                    + childID
            + ")");
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public String getChildNameByChildID(int childID) throws SQLException, ClassNotFoundException {
        String name = "";
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM Child WHERE child_id = " + childID);

            while (rs.next())
            {
                name = (rs.getString("name"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return name;
    }
    
    public String getChildNameByIDNumber(String idNumber) throws SQLException, ClassNotFoundException {
        String name = "";
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM Child WHERE id_num = " + idNumber);

            while (rs.next())
            {
                name = (rs.getString("name"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return name;
    }
    
    public String getChildNameByParentID(int parentID) throws SQLException, ClassNotFoundException {
        String name = "";
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM Child WHERE parent_id = " + parentID);

            while (rs.next())
            {
                name = (rs.getString("name"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return name;
    }
    
    public String getChildSurnameByName(String cName) throws SQLException, ClassNotFoundException {
        String lastName = "";
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT last_name FROM Child WHERE name = " + cName);

            while (rs.next())
            {
                lastName = (rs.getString("last_name"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return lastName;
    }
    
    public String getChildSurnameByChildID(int childID) throws SQLException, ClassNotFoundException {
        String lastName = "";
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT last_name FROM Child WHERE child_id = " + childID);

            while (rs.next())
            {
                lastName = (rs.getString("last_name"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return lastName;
    }
    
    public Date getChildDOBByChildID(int childID) throws SQLException, ClassNotFoundException {
        Date dob = java.sql.Date.valueOf("2014-06-01");
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT dob FROM Child WHERE child_id = " + childID);

            while (rs.next())
            {
                dob = (rs.getDate("dob"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return dob;
    }
}
