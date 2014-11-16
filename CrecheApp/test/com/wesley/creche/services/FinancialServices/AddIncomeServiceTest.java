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
public class AddIncomeServiceTest {
    
    public AddIncomeServiceTest() {
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
     * Test of addIncome method, of class AddIncomeService.
     */
    @Test
    public void testAddIncome() throws Exception {
        System.out.println("addIncome");
        String descrip = "Test Case data";
        String date = "2012-12-31";
        double amount = 100.0;
        AddIncomeService instance = new AddIncomeService();
        instance.addIncome(descrip, date, amount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
