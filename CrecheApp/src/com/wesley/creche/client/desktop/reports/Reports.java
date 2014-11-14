/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.client.desktop.reports;

import com.itextpdf.text.DocumentException;
import com.wesley.creche.client.desktop.MainFrame;
import com.wesley.creche.client.desktop.Styles.Styles;
import com.wesley.creche.services.pdf.createPdf;
import com.wesley.creche.client.desktop.financeReports.finReportsForm;
import java.io.IOException;

/**
 *
 * @author KarstensC
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    
    final Styles styles = new Styles();
    public Reports() {
        super("Reports");
        initComponents();
        styles.setFrameStyles(this);
        styles.setMainScreenButtonStyle(btnFinance);
        styles.setMainScreenButtonStyle(btnHR);
        styles.setMainScreenButtonStyle(btnProgress);
        styles.setButtonStyle(btnExit);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFinance = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHR = new javax.swing.JButton();
        btnProgress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFinance.setText("Finance");
        btnFinance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceActionPerformed(evt);
            }
        });

        btnExit.setText("Back");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnHR.setText("Human Resources");

        btnProgress.setText("Progress Reports");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProgress)
                    .addComponent(btnHR)
                    .addComponent(btnFinance))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnFinance)
                .addGap(18, 18, 18)
                .addComponent(btnHR)
                .addGap(18, 18, 18)
                .addComponent(btnProgress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceActionPerformed
        finReportsForm finReports = new finReportsForm();
        finReports.setVisible(true);
        this.setVisible(false);
        
        
        
        
        
        
        
        /*createPdf test = new createPdf();
        
        try {
            test.writePdf();
        }
        catch (DocumentException | IOException ex) {
            
        }*/
    }//GEN-LAST:event_btnFinanceActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinance;
    private javax.swing.JButton btnHR;
    private javax.swing.JButton btnProgress;
    // End of variables declaration//GEN-END:variables
}
