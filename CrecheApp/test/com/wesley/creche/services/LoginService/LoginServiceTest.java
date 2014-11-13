/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.LoginService;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author TaswellSalie
 */
public class LoginServiceTest {
    
    public LoginServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLogin method, of class LoginService.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        String uName = "";
        String pWord = "";
        LoginService instance = new LoginService();
        boolean expResult = false;
        boolean result = instance.getLogin(uName, pWord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
       // Assert.assertEquals("", "tazz", "tazz");
    }
    
}
