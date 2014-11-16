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
public class AddExpensesServiceTest {
    
    public AddExpensesServiceTest() {
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
     * Test of addExpense method, of class AddExpensesService.
     */
    @Test
    public void testAddExpense() throws Exception {
        System.out.println("addExpense");
        String descrip = "";
        String dateExpended = "";
        double amount = 0.0;
        AddExpensesService instance = new AddExpensesService();
        instance.addExpense(descrip, dateExpended, amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
