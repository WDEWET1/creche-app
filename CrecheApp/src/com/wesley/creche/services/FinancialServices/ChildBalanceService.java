/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.FinancialServices;

import com.wesley.creche.domain.Administration.Child;
import com.wesley.creche.domain.Administration.Fees;
import com.wesley.creche.services.DatabaseConnectionService.ConnectDatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author TaswellSalie
 */
public class ChildBalanceService {
        
    private static ArrayList getFeesList() throws ClassNotFoundException, SQLException{
        //ArrayList<Child> child = new ArrayList();
        ArrayList<Fees> feeList = new ArrayList();
        Fees feeObject = null;
        
        ConnectDatabase connect = new ConnectDatabase();
        Connection con = connect.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select fee_id, child_id, amount_due, status, total "
                                        + "FROM fees");
        
        while (rs.next())
            {
               
                feeObject = new Fees();
                feeObject.setFee_id(Integer.parseInt(rs.getString(1)));
                feeObject.setChild_id(Integer.parseInt(rs.getString(2)));
                feeObject.setAmountDue(Double.parseDouble(rs.getString(3)));
                feeObject.setStatus(rs.getString(4));
                feeObject.setTotal(Double.parseDouble(rs.getString(5)));
                
                feeList.add(feeObject);               
            }
        
        return feeList;
    }
    
    private static ArrayList getChildList() throws ClassNotFoundException, SQLException{
        //ArrayList<Child> child = new ArrayList();
        ArrayList<Child> childList = new ArrayList();   
        Child childObject = null;
        
        ConnectDatabase connect = new ConnectDatabase();
        Connection con = connect.getConnection();
        
        Statement stmt = con.createStatement();
        //ResultSet rs = stmt.executeQuery("Select child.child_id, child.id_num, child.name, child.last_name, child.dob fees.fee_id, fees.child_id, fees.amount_due, fees.status, fees.total "
        //        + "FROM child, fees;");
        ResultSet rs = stmt.executeQuery("Select child_id, id_num, name, last_name, dob "
                                        + "FROM child");
        
            while (rs.next())
            {
               childObject = new Child();
               childObject.setChildID(Integer.parseInt(rs.getString(1)));
               childObject.setIdNumber(rs.getString(2));
               childObject.setName(rs.getString(3));
               childObject.setLastName(rs.getString(4));
               childObject.setDob(rs.getString(5));

               childList.add(childObject);
            }
        /*
        for(int i = 0 ; i < childList.size() ; i++){
            //System.out.println();
            
            System.out.println(childList.get(i).getChildID() +" "+childList.get(i).getName()+" "+childList.get(i).getLastName());
            
        }
        */
     
        return childList;
            
    }
    
    public  ArrayList getChildDetails() throws ClassNotFoundException, SQLException{
        ArrayList<getChildDetails> childDetailsList = new ArrayList<>();
        ArrayList<Child> childList = getChildList();
        ArrayList<Fees> feeList = getFeesList();
        
        getChildDetails det = null;
               
        for(int i =0; i < feeList.size(); i++){
            det = new getChildDetails();
            det.setFee_id(feeList.get(i).getFee_id());
            det.setChild_id(feeList.get(i).getChild_id());
            det.setAmountDue(feeList.get(i).getAmountDue());
            det.setStatus(feeList.get(i).getStatus());
            det.setTotal(feeList.get(i).getTotal());
            
            for(int j = 0 ; j < childList.size(); j++){
                if(feeList.get(i).getChild_id() == childList.get(j).getChildID()){
                    det.setName(childList.get(j).getName());
                    det.setSurname(childList.get(j).getLastName());
                    det.setDOB(childList.get(j).getDob());
                }
            }
            
            childDetailsList.add(det);
        }
        
        return childDetailsList;
        
    } 
    /*
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
       ArrayList<getChildDetails> ar = getChildDetails();
       for(int i = 0 ; i < ar.size(); i++){
        System.out.println(ar.get(i).getFee_id()+" "+ar.get(i).getChild_id()+" "+ar.get(i).getName());   
       }
    }
    */
    
}
