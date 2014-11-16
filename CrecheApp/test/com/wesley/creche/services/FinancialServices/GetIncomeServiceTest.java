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
public class GetIncomeServiceTest {
    
    public GetIncomeServiceTest() {
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
     * Test of getIncomeList method, of class GetIncomeService.
     */
    @Test
    public void testGetIncomeList() throws Exception {
        System.out.println("getIncomeList");
        GetIncomeService instance = new GetIncomeService();
        ArrayList expResult = null;
        ArrayList result = instance.getIncomeList();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIncomeByMonthAndYear method, of class GetIncomeService.
     */
    @Test
    public void testGetIncomeByMonthAndYear() throws Exception {
        System.out.println("getIncomeByMonthAndYear");
        String month = "November";
        String year = "2014";
        GetIncomeService instance = new GetIncomeService();
        ArrayList expResult = null;
        ArrayList result = instance.getIncomeByMonthAndYear(month, year);
        //assertEquals(expResult, result);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthNumber method, of class GetIncomeService.
     */
    @Test
    public void testGetMonthNumber() {
        System.out.println("getMonthNumber");
        String monthName = "December";
        GetIncomeService instance = new GetIncomeService();
        String expResult = "12";
        String result = instance.getMonthNumber(monthName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
