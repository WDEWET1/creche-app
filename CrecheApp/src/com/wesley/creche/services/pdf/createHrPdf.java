/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.services.pdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.TabSettings;
import com.itextpdf.text.pdf.PdfWriter;
import com.wesley.creche.services.SQLQueries;
import com.wesley.creche.services.createFolder.createFolder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KarstensC
 */
public class createHrPdf {
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
      Font.BOLD);
      private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
          Font.NORMAL, BaseColor.RED);
      private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
          Font.BOLD);
      private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
      Font.BOLD);
      private static Font italic = new Font(Font.FontFamily.TIMES_ROMAN, 14,
      Font.ITALIC);
      private static Font courier = new Font(Font.FontFamily.COURIER, 12,
      Font.ITALIC);
      private static SQLQueries s = new SQLQueries();
      
      private static void createFolderIfNotExist() {
        createFolder createFolder = new createFolder();
        createFolder.createFolder();
    }
    
    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
          paragraph.add(new Paragraph(" "));
        }
    }
    
    private static void addEmptyLine(Document document, int number) throws DocumentException {
         Paragraph paragraph = new Paragraph();
        for (int i = 0; i < number; i++) {
          paragraph.add(new Paragraph(" "));
          document.add(paragraph);
        }
    }
    
    private static String getEmpName() throws SQLException, ClassNotFoundException {
         String empName = s.getEmployeeName();
        return empName;
    }
    
    private static String getEmpLastName() throws SQLException, ClassNotFoundException {
         String empName = s.getEmployeeName();
        return empName;
    }
    
    private static String getEmpEmail() throws SQLException, ClassNotFoundException {
         String empName = s.getEmployeeName();
        return empName;
    }
    
    private static void addLine(Document document) throws DocumentException {
        Paragraph paragraph = new Paragraph();
        paragraph.add(new Paragraph("-----------------------------------------------------------------------------------"));
        document.add(paragraph);
    }
    
    private static void addTitle(Document document)
      throws DocumentException {
        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 1);
        // Lets write a big header
        preface.add(new Paragraph("Staff / Human Resources Report", catFont));

        addEmptyLine(preface, 1);
        
        preface.add(new Paragraph("Report generated on: " + new Date(), smallBold));
        
        document.add(preface);
  }
     public void writePdfHrReport() throws DocumentException, IOException, SQLException {
        
        createFolderIfNotExist();
        
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String today = df.format(date);
        String fileName = "C:\\creche\\reports\\HRReport" + today + "_.pdf";
        
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(fileName));
        
        document.open();
        
        addTitle(document);
        addLine(document);
        addEmptyLine(document, 2);
        
        try {
            document.add(new Paragraph(getEmpName()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(createHrPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            document.add(new Paragraph(getEmpLastName()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(createHrPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        document.close();
    }
}
