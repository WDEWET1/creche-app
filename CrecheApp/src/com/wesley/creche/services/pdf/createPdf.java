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

/**
 *
 * @author KarstensC
 */
public class createPdf {
    
    private static void createFolderIfNotExist() {
        createFolder createFolder = new createFolder();
        createFolder.createFolder();
    }
    
    private static void createHeader(String name) {
        
    }
    
    public void writePdf() throws DocumentException, IOException {
        createFolderIfNotExist();
        
        Document doc = new Document();
        
        PdfWriter.getInstance(doc, new FileOutputStream("c:\\creche\\reports\\test.pdf"));
        doc.open();
        doc.add(new Paragraph("Hello World"));
        doc.add(new Paragraph("This is me"));
        doc.close();
    }
}
