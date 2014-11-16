/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.FinancialServices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TaswellSalie
 */
public class MonthFromStringToNumberTest {
    
    public MonthFromStringToNumberTest() {
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
     * Test of getMonthStringToNumber method, of class MonthFromStringToNumber.
     */
    @Test
    public void testGetMonthStringToNumber() {
        System.out.println("getMonthStringToNumber");
        String monthName = "";
        MonthFromStringToNumber instance = new MonthFromStringToNumber();
        String expResult = "";
        String result = instance.getMonthStringToNumber(monthName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
