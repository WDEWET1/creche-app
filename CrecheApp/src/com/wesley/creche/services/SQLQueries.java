/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services;

import com.wesley.creche.domain.Administration.Emergency;
import com.wesley.creche.domain.Administration.Employee;
import com.wesley.creche.domain.Administration.Parents;
import com.wesley.creche.domain.Administration.Progress;
import com.wesley.creche.domain.Administration.User;
import com.wesley.creche.services.LoginService.Encryption;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KarstensC
 */
public class SQLQueries{ 

private int childID;
    
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
    public void insertIntoEmployees(Employee e, String jobTitle) throws SQLException, ClassNotFoundException {
        
        int jobID = getJobID(jobTitle);
        
       try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO employees ("
                + "job_id, name, last_name, email, ph_number, address, hire_date, "
                + "acc_number) "
                + "VALUES ("
                + "'" + jobID + "', "
                + "'" + e.getName() + "', "
                + "'" + e.getLastName() + "', "
                + "'" + e.getEmail() + "', "
                + "'" + e.getContact() + "', "
                + "'" + e.getAddress() + "', "
                + "'" + e.getHireDate() + "', "
                + "'" + e.getAccountNumber()+ "'"
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
    public void insertIntoParent(Parents parent) throws SQLException, ClassNotFoundException {
       
        Connection con = getTheConnection();
        Statement stm = con.createStatement();
        
        try {
        Connection conn = getTheConnection();
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO parent ("
                + "father_name, father_last_name, father_ID_no, father_occupation, father_contact,"
                + "mother_name, mother_last_name, mother_ID_no, mother_occupation, mother_contact)"
                + "VALUES ("
                + "'" + parent.getFatherName() + "', "
                + "'" + parent.getFatherLastName() + "', "
                + "'" + parent.getFatherID() + "', "
                + "'" + parent.getFatherOccupation() + "', "
                + "'" + parent.getFatherContact() + "', "
                + "'" + parent.getMotherName() + "', "
                + "'" + parent.getMotherLastName() + "', "
                + "'" + parent.getMotherID() + "', "
                + "'" + parent.getFatherOccupation() + "', "
                + "'" + parent.getMotherContact() + "'"
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
    public void insertIntoProgress(Progress progress) throws SQLException, ClassNotFoundException {

        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("UPDATE progress SET "+
                " reading =     "+"'"+progress.getReading()+"',"+
                " phonics =     "+"'"+progress.getPhonics()+"',"+
                " spelling =    "+"'"+progress.getSpelling()+"',"+
                " obedience =   "+"'"+progress.getObedience()+"',"+
                " arithmetic =  "+"'"+progress.getArithmetic()+"',"+
                " attitude =    "+"'"+progress.getAttitude()+"',"+
                " homework =    "+"'"+progress.getHomework()+"'"+
                " WHERE child_id = "+"'"+childID+"'");
        
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
            
            ResultSet rs = stmt.executeQuery("SELECT last_name FROM child WHERE name = '" + cName + "';");
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
    
    public ArrayList getJobs() throws SQLException, ClassNotFoundException {
        
        ArrayList jobs = new ArrayList();
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT job_title FROM jobs");
            int i = 0;
            while (rs.next())
            {
               jobs.add(rs.getString(1)); 
                       
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return jobs;
    }
    
    public int getJobID(String jobTitle) throws SQLException, ClassNotFoundException {

        int jobID = 0;
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT job_id FROM jobs WHERE job_title = " + "'"+jobTitle+"'");

            while (rs.next())
            {
                jobID = rs.getInt(1);
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return jobID;
    }
    
    public int getLastParentID() throws SQLException, ClassNotFoundException {
        int parentID = 0;
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM parent");

            while (rs.next())
            {
                parentID = (rs.getInt("parent_id"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return parentID;
    }
    
    public ArrayList getTeachers() throws SQLException, ClassNotFoundException {
        
        ArrayList teachers = new ArrayList();
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM employees, jobs WHERE job_title = 'teacher'");
            int i = 0;
            while (rs.next())
            {
               teachers.add(rs.getString(1)); 
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return teachers;
    }
    
    public ArrayList getChildren() throws SQLException, ClassNotFoundException {
        
        ArrayList children = new ArrayList();
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM child");
            int i = 0;
            while (rs.next())
            {
               children.add(rs.getString(1)); 
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return children;
    }
    
    public int getChildIDByName(String name) throws SQLException, ClassNotFoundException {
 
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT child_id FROM Child WHERE name = " + "'"+name+"'");
            while (rs.next())
            {
                childID = (rs.getInt("child_id"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return childID;
    }
    
    public Date getChildStartDateByName(String name) throws SQLException, ClassNotFoundException {
 
        Date startDate = java.sql.Date.valueOf("2014-01-01");
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT start_date FROM Child WHERE name = " + "'"+name+"'");
            while (rs.next())
            {
                startDate = (rs.getDate("start_date"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return startDate;
    }
    
    public String getChildAccountStatusByChildId(int id) throws SQLException, ClassNotFoundException {
 
        String status = "";
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT status FROM fees WHERE child_id = " + "'"+id+"'");
            while (rs.next())
            {
                status = (rs.getString("status"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return status;
    }
    
    public Double getChildAmountDueByChildId(int id) throws SQLException, ClassNotFoundException {
 
        Double amountDue = 0.00;
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT amount_due FROM fees WHERE child_id = " + "'"+id+"'");
            while (rs.next())
            {
                amountDue = (rs.getDouble("amount_due"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return amountDue;
    }
    
    public Date getChildLastDateByName(String name) throws SQLException, ClassNotFoundException {
 
        Date lastDate = java.sql.Date.valueOf("2014-01-01");
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT last_date FROM Child WHERE name = " + "'"+name+"'");
            while (rs.next())
            {
                lastDate = (rs.getDate("last_date"));
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return lastDate;
    }
    
    public void refreshProgressIDs() throws SQLException, ClassNotFoundException {
        
        ArrayList children = new ArrayList();
        ArrayList children2 = new ArrayList();
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT child_id FROM child");
            int i = 0;
            while (rs.next())
            {
               children.add(rs.getString(1)); 
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT child_id FROM progress");
            int i = 0;
            while (rs.next())
            {
               children2.add(rs.getString(1)); 
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
        if(!children.equals(children2)){
        
            try {
                for (Object children1 : children) {
                    Connection con = getTheConnection();
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("INSERT INTO progress ("
                            + "child_id) "
                            + "VALUES ("
                            + "'" + children1 + "'"
                            + ")");
                    con.close();
                }
            }
            catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
    }
    
    public void insertIntoUsers(User user) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO user ("
                + "username, password) "
                + "VALUES ("
                + "'"+user.getUsername() + "', "
                + "'"+user.getPassword() + "'"
        + ")");
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

  
    public boolean getUsernameAndPasswordFromDB(User user) throws SQLException, ClassNotFoundException {

        String dbUsername = null;
        String dbPassword = null;
        
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT username, password FROM user WHERE username = "+"'"+user.getUsername()+"'");
        
        while (rs.next()){
                dbUsername = (rs.getString(1));
                System.out.println("username - --------------------    "+dbUsername);
                dbPassword = (rs.getString(2));
                System.out.println("password - --------------------    "+dbPassword);
        }
        rs.close();
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }   

        return (user.getUsername().equals(dbUsername) && user.getPassword().equals(dbPassword));
    }

    public String getChildForFinReports() throws SQLException, ClassNotFoundException {

        String childFirstName = "";
        String childLastName = "";
        
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name, last_name FROM child;");

            while (rs.next())
            {
                childFirstName = rs.getString("name");
                childLastName = rs.getString("last_name");
                return childFirstName + " " + childLastName;
            }
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return "";
    }

    public void updatePassword(String oldEncryptedPassword, String newEncryptedPassword) {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("UPDATE user SET "+
                " password =    "+"'"+newEncryptedPassword+"'"+
                " WHERE password = "+"'"+oldEncryptedPassword+"'");
        
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public boolean checkIfPasswordExists(String oldPassword) throws SQLException, ClassNotFoundException {
 
        try {
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            int result = 0;
            
            ResultSet rs = stmt.executeQuery("SELECT password FROM user WHERE password = " + "'"+oldPassword+"'");
            while (rs.next())
            {
                result = (rs.getInt(1));
            }
            
            if(result == 0){
                
                return false;
            }
            
            rs.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return true;
    }
    
    public void resetPasswordAndUserName(String u, String p) throws NoSuchAlgorithmException, ClassNotFoundException, FileNotFoundException, SQLException{
        
            Connection con = getTheConnection();
            Statement stmt = con.createStatement();

            Encryption e = new Encryption();
            String epas = e.encrypt(p);

            stmt.executeUpdate("INSERT INTO user ("
                    + "username, password) "
                    + "VALUES ("
                    + "'"+u+ "', "
                    + "'"+epas+ "'"
            + ")");
            }
    
    
    public void insertIntoEmergency(Emergency e) throws SQLException, ClassNotFoundException {
        try {
        Connection con = getTheConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO emergency ("
                + "ambulance, police, fire) "
                + "VALUES ("
                + "'"+e.getAmbulance() + "',"
                + "'"+e.getPolice() + "',"
                + "'"+e.getFire()+"'"
        + ")");
        con.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}



