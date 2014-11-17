/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.app.factory;

import com.wesley.creche.domain.Administration.Emergency;

/**
 *
 * @author Wesleyjohn
 */
public class EmergencyFactory {
    
    public Emergency getEmergency(String f, String a, String p){
        
        Emergency e = new Emergency();
        e.setAmbulance(a);
        e.setFire(f);
        e.setPolice(p);
        
        return e;
    }
}
