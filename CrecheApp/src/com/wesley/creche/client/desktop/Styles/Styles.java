/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.client.desktop.Styles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author TaswellSalie
 */
public class Styles {
    
    //private JButton button;
    //JButton button = new JButton();
    
    public void setButtonStyle(JButton button){
                
        Font font = new Font("century gothic", 1, 14);
        button.setFont(font);
        button.setBackground(Color.WHITE);
        //button.setText("<< Back");
        button.setForeground(Color.BLACK);
        button.setSize(73, 23);
               
    }
    
    public void setMainScreenButtonStyle(JButton button){
                
        Font font = new Font("century gothic", 1, 14);
        button.setFont(font);
        button.setBackground(Color.WHITE);
        //button.setText("<< Back");
        button.setForeground(Color.BLACK);
        button.setSize(161, 25);
               
    }
    
    
    public void setFrameStyles(JFrame frame){
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.getHSBColor(120, 99, 90));
        frame.setBackground(Color.yellow);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/babyLogo3.png")));
    }
    
    
    
    
    public void setPanelStyles(JPanel panel){
        panel.setBackground(Color.WHITE);
    }
    
    public void setHeaderLabel(JLabel label){
        Font font = new Font("century gothic", 1, 24);
        label.setFont(font);
        
    }
    
    public void setSubHeaderLabel(JLabel label){
        Font font = new Font("century gothic", 1, 24);
        label.setFont(font);
    }
    
    public void setMainHeaderLabel(JLabel label){
        Font font = new Font("Wide Latin", Font.BOLD , 24);
        label.setFont(font);
        label.setForeground(Color.RED);
    }
    
    public void setNormalLabel(JLabel label){
        Font font = new Font("century gothic", 1, 14);
        label.setFont(font);
    }   
    
    public void setImage(JLabel label){
        //com\app\frontEnd\styles\images\Abc_Blocks_clip_art_small.png
        String imageURL = "/com/wesley/creche/client/desktop/styles/images/Abc_Blocks_clip_art_small.png";
        //String imageURL = "/Abc_Blocks_clip_art_small.png";
        ImageIcon icon = new ImageIcon(getClass().getResource(imageURL));
        label.setIcon(icon);
        label.setText("");       
        
    }
    
    
    public void setTime(final JLabel label){
      
        TimeDateProvider timeDate = new TimeDateProvider();
        
        timeDate.getTimeDate(label);
        setNormalLabel(label);
        label.setForeground(Color.RED);
    }
    
}