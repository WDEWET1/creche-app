/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.client.desktop.Styles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author TaswellSalie
 */
public class TimeDateProvider {
    private DateFormat timeFormat = new SimpleDateFormat("dd-MMM-yyyy     HH:mm:ss");
    
    public void getTimeDate(final JLabel label){
    
    ActionListener timeListener = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Date date = new Date();
            String time = timeFormat.format(date);
            label.setText(time);
        }
    };
     Timer timer = new Timer(1000,timeListener);
     timer.setInitialDelay(0);
     timer.start();
    }
    
}
