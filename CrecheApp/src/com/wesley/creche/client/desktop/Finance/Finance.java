/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.client.desktop.Finance;

import com.wesley.creche.client.desktop.MainFrame;
import com.wesley.creche.client.desktop.Styles.Styles;
import com.wesley.creche.domain.Finance.Expense;
import com.wesley.creche.domain.Finance.Income;
import com.wesley.creche.services.FinancialServices.GetExpensesService;
import com.wesley.creche.services.FinancialServices.GetIncomeService;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TaswellSalie
 */
public final class Finance extends javax.swing.JFrame {

    /**
     * Creates new form Accounting
     */
    Styles style = new Styles();
    GetIncomeService incomeService = new GetIncomeService();
    GetExpensesService expenseService = new GetExpensesService();        
    
    public Finance() throws ClassNotFoundException, SQLException {
        super("Finance(Income and Expenditures)");
        initComponents();
        
        style.setFrameStyles(this);
        style.setButtonStyle(jButton1);
        style.setButtonStyle(jButton2);
        style.setButtonStyle(jButton3);
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);     
        jRadioButton1.setSelected(true);
        setTableToIncome();
        setCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Income");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Expenditure");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton2)
                        .addGap(73, 73, 73)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FinanceChoice finChoice = new FinanceChoice();
        finChoice.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
            try {
                // TODO add your handling code here:
                setTableToIncome();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      
            try {
                // TODO add your handling code here:
                setTableToExpense();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        setTableAccordingToComboBox();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        setTableAccordingToComboBox();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            AddIncomeForm addInForm = new AddIncomeForm();
            addInForm.setVisible(true);
        }else if(jRadioButton2.isSelected()){
            AddExpenseForm addExpForm = new AddExpenseForm();
            addExpForm.setVisible(true);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setTableToIncome() throws ClassNotFoundException, SQLException{
        ArrayList<Income> incomelist = incomeService.getIncomeList();
        
        String col[] = {"Income_ID", "Description","Date_received", "Amount"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        
        for(int i = 0; i <incomelist.size(); i++){
        
            int income_id = incomelist.get(i).getIncome_id();
            String Description = incomelist.get(i).getDesc();
            String date = incomelist.get(i).getDate();
            double amount = incomelist.get(i).getAmount();
            
            Object[] data = {income_id, Description, date, amount};
            tableModel.addRow(data);                           
        }        
        jTable1.setModel(tableModel);     
    }
    
    private void setTableToIncomeWithMonths(String month, String year) throws ClassNotFoundException, SQLException{
        ArrayList<Income> incomelist = incomeService.getIncomeByMonthAndYear(month, year);
        
        String col[] = {"Income_ID", "Description","Date_received", "Amount"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        
        for(int i = 0; i <incomelist.size(); i++){
        
            int income_id = incomelist.get(i).getIncome_id();
            String Description = incomelist.get(i).getDesc();
            String date = incomelist.get(i).getDate();
            double amount = incomelist.get(i).getAmount();
            
            Object[] data = {income_id, Description, date, amount};
            tableModel.addRow(data);                           
        }        
        jTable1.setModel(tableModel);     
    }
    
    private void setTableToExpense() throws ClassNotFoundException, SQLException{
        ArrayList<Expense> expenseList = expenseService.getExpensesList();
        
        String col[] = {"Expense_ID", "Description","Date_received", "Amount"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        
        for(int i = 0; i < expenseList.size(); i++){
            int expense_id = expenseList.get(i).getExpense_id();
            String descrip = expenseList.get(i).getDesc();
            String date = expenseList.get(i).getDate();
            double amount = expenseList.get(i).getAmount();
            
            Object[] data = {expense_id, descrip, date, amount};
            tableModel.addRow(data);
        }
        
        jTable1.setModel(tableModel);
    }
    
    private void setTableToExpenseWithMonths(String month,String year) throws ClassNotFoundException, SQLException{
        ArrayList<Expense> expenseList = expenseService.getExpenseListByMonthAndYear(month, year);
        
        String col[] = {"Expense_ID", "Description","Date_received", "Amount"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        
        for(int i = 0; i < expenseList.size(); i++){
            int expense_id = expenseList.get(i).getExpense_id();
            String descrip = expenseList.get(i).getDesc();
            String date = expenseList.get(i).getDate();
            double amount = expenseList.get(i).getAmount();
            
            Object[] data = {expense_id, descrip, date, amount};
            tableModel.addRow(data);
        }
        
        jTable1.setModel(tableModel);
    }
    
    private void setTableAccordingToComboBox(){
        String month = (String)jComboBox1.getSelectedItem();
        String year =  (String) jComboBox2.getSelectedItem();
        
        if(jRadioButton1.isSelected()){
            try {
                setTableToIncomeWithMonths(month, year);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }else if(jRadioButton2.isSelected()){
            
            try {
                setTableToExpenseWithMonths(month, year);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    
    private void setCombobox(){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(months));
        
        String[] years = {"2012","2013","2014"};
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(years));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
