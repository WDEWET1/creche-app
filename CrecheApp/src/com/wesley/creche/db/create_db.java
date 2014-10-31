/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sun.security.pkcs11.P11TlsKeyMaterialGenerator;


/**
 *
 * @author karstensc
 */
public class create_db {
    
    public static void main(String[] args) throws Exception {
        create_db d = new create_db();
        d.create_db();
    }
    

    public void create_db() throws Exception {
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);

        String serverName = "localhost";
        String mydatabase = "creche";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

        String username = "root";
        String password = "";


        Connection connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        
        //Create fees table
        System.out.println("Creating fees table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Fees ("
                    + "fee_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "child_id INT(10) NOT NULL, "
                    + "amount_due NUMERIC(15,2), "
                    + "status VARCHAR(100), "
                    + "total NUMERIC(15,2)"
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Fees Table: " + ex);
        }
        
        //Create Employees table
        System.out.println("Creating Employees table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Employees ("
                    + "emp_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "job_id INT(10) NOT NULL, "
                    + "name VARCHAR(50), "
                    + "last_name VARCHAR(100), "
                    + "email VARCHAR(100), "
                    + "ph_number VARCHAR(100), "
                    + "address VARCHAR(100), "
                    + "hire_date DATE, "
                    + "salary NUMERIC(15,2)"
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Employees Table: " + ex);
        }
        
        //Create Child table
        System.out.println("Creating Child table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Child ("
                    + "child_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "id_num INT(15) NOT NULL, "
                    + "name VARCHAR(100), "
                    + "last_name VARCHAR(100), "
                    + "dob DATE, "
                    + "med_con VARCHAR(100), "
                    + "start_date DATE, "
                    + "end_date DATE, "
                    + "grade VARCHAR(100), "
                    + "parent_id INT(10), "
                    + "emp_id INT(10)"
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Child Table: " + ex);
        }
        
        //Create Job/Positions table
        System.out.println("Creating Job/Positions table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Jobs ("
                    + "job_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "job_title VARCHAR(100), "
                    + "min_salary NUMERIC(15,2), "
                    + "max_salary NUMERIC(15,2)"
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Job/Positions: " + ex);
        }
       
        //Create Parent table
        System.out.println("Creating Parent table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Parent ("
                    + "parent_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "father_name VARCHAR(100), "
                    + "father_last_name VARCHAR(100), "
                    + "father_ID_no INT(15), "
                    + "father_occupation VARCHAR(100), "
                    + "mother_name VARCHAR(100), "
                    + "mother_last_name VARCHAR(100), "
                    + "mother_ID_no INT(15), "
                    + "mother_occupation VARCHAR(100), "
                    + "child_id INT(10) NOT NULL"
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Parent Table: " + ex);
        }
        
        //Create Progress table
        System.out.println("Creating Progress table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Progress ("
                    + "progress_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "child_id INT(10) NOT NULL, "
                    + "reading INT(15), "
                    + "phonics INT(15), "
                    + "spelling INT(15), "
                    + "obedience INT(15), "
                    + "arithmetic INT(15), "
                    + "attitude INT(15), "
                    + "homework INT(15)"
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Progress Table: " + ex);
        }
        
        //Create Attendance table
        System.out.println("Creating Attendance table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Attendance ("
                    + "id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "child_id INT(10) NOT NULL, "
                    + "date DATE, "
                    + "absent TINYINT(1)" //Boolean Value: 1 means true / 0 means false...!
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Attendance Table: " + ex);
        }
        
        //Create Emergency table
        System.out.println("Creating Emergency table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Emergency ("
                    + "ambulance TINYINT(1), " //Boolean Value: 1 means true / 0 means false...!
                    + "police TINYINT(1), " //Boolean Value: 1 means true / 0 means false...!
                    + "fire TINYINT(1)" //Boolean Value: 1 means true / 0 means false...!
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Emergency Table: " + ex);
        }
        
        //Create Subject table
        System.out.println("Creating Subject(s) table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Subject ("
                    + "subject_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "subject_name VARCHAR(100) NOT NULL, "
                    + "child_id INT(10) NOT NULL"
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Subject Table: " + ex);
        }
        
        //Create Products table
        System.out.println("Creating Products table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Products ("
                    + "product_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "supplier_id INT(10) NOT NULL, "
                    + "cat_id INT(10) NOT NULL, "
                    + "quantity_per_unit INT(100), "
                    + "unit_price NUMERIC(15,2), "
                    + "units_in_stock INT, "
                    + "last_date_update DATE"
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Products Table: " + ex);
        }
        
        //Create Categories table
        System.out.println("Creating Categories table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Categories ("
                    + "cat_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "cat_name VARCHAR(100), "
                    + "description VARCHAR(500)"
                    
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Categories Table: " + ex);
        }
        
        //Create Orders table
        System.out.println("Creating Orders table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Orders ("
                    + "order_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "emp_id INT(10) NOT NULL, "
                    + "order_date DATE"
                    
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Orders Table: " + ex);
        }
        
        //Create Order Details table
        System.out.println("Creating Order Details table......");
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Order_details ("
                    + "order_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "prod_id INT(10) NOT NULL, "
                    + "unit_price NUMERIC(15,2), "
                    + "quantity INT, "
                    + "discount INT(100)"
                    
            + ")");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Order Details Table: " + ex);
        }
    }
}
