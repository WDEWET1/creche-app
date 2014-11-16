/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.services.FinancialServices;

import java.util.ArrayList;
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
public class GetExpensesServiceTest {
    
    public GetExpensesServiceTest() {
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
     * Test of getExpensesList method, of class GetExpensesService.
     */
    @Test
    public void testGetExpensesList() throws Exception {
        System.out.println("getExpensesList");
        GetExpensesService instance = new GetExpensesService();
        ArrayList expResult = null;
        ArrayList result = instance.getExpensesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpenseListByMonthAndYear method, of class GetExpensesService.
     */
    @Test
    public void testGetExpenseListByMonthAndYear() throws Exception {
        System.out.println("getExpenseListByMonthAndYear");
        String month = "";
        String year = "";
        GetExpensesService instance = new GetExpensesService();
        ArrayList expResult = null;
        ArrayList result = instance.getExpenseListByMonthAndYear(month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
