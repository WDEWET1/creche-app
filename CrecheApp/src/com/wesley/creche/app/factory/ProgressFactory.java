/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.app.factory;

import com.wesley.creche.domain.Administration.Progress;

/**
 *
 * @author Wesleyjohn
 */
public class ProgressFactory {
    public Progress getProgress( int reading, int phonics, int spelling, int obedience, int arithmetic, int attitude, int homework){
        
        Progress progress = new Progress();
        
        progress.setReading(reading);
        progress.setPhonics(phonics);
        progress.setSpelling(spelling);
        progress.setObedience(obedience);
        progress.setArithmetic(arithmetic);
        progress.setAttitude(attitude);
        progress.setHomework(homework);
        
        return progress;
    }
}
