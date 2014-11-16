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
import com.itextpdf.text.pdf.draw.DottedLineSeparator;

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
        preface.add(new Paragraph("Financial Statement", catFont));

        addEmptyLine(preface, 1);
        
        preface.add(new Paragraph("Report generated on: " + new Date(), smallBold));
        
        document.add(preface);
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
        
        addTitle(document);
        addLine(document);
        
        document.add(new Paragraph("Name : " + name + " " + lastName, italic));
        addEmptyLine(document, 2);
        
        Paragraph paragraph = new Paragraph();
        paragraph.add("Start Date :");
        paragraph.setTabSettings(new TabSettings());
        paragraph.add(Chunk.TABBING);
        paragraph.add(new Chunk(startDate));
        document.add(paragraph);
        addEmptyLine(document, 1);
        
        document.add(new Paragraph("Account Status : " + accStatus));
        addEmptyLine(document, 1);
        
        document.add(new Paragraph("Total Amount Outstanding : R" + amountDue));
        
        
        
        
        
        
        
        
        document.close();
    }
}
