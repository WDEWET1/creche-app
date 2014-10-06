/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.creche.domain.Administration;

/**
 *
 * @author Wesleyjohn
 */
public interface Person {
    public Contact getContact();
    public Address getAddress();
    public Demographics getDemographics();
    
    public Contact setContact(Contact contact);
    public Address setAddress(Address address);
    public Demographics setDemographics(Demographics demographics);
}
