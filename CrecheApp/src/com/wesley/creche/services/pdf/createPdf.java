/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services.pdf;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import com.wesley.creche.services.createFolder.createFolder;
import com.wesley.creche.services.SQLQueries;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author KarstensC
 */
public class createPdf {
    
    private static void createFolderIfNotExist() {
        createFolder createFolder = new createFolder();
        createFolder.createFolder();
    }
    
    public void writePdfFinancialReport(String name, String startDate,
            String accStatus, String amountDue) throws DocumentException, IOException {
        
        createFolderIfNotExist();
        SQLQueries s = new SQLQueries();
        
        String lastName = "";
        
        try {
            lastName = s.getChildSurnameByName(name);
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String today = df.format(date);
        String fileName = "C:\\creche\\reports\\" + name + today + "_.pdf";
        
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(fileName));
        
        document.open();
        
        Paragraph par = new Paragraph("Financial Report : " + today);
        par.getFont().setStyle(Font.BOLD);
        document.add(par);
        
        //document.add(new paragraph("-----------------------------"));
        
        
        
        document.close();
    }
}
