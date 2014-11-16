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
public class ChildBalanceServiceTest {
    
    public ChildBalanceServiceTest() {
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
     * Test of getChildDetails method, of class ChildBalanceService.
     */
    @Test
    public void testGetChildDetails() throws Exception {
        System.out.println("getChildDetails");
        ChildBalanceService instance = new ChildBalanceService();
        ArrayList expResult = instance.getChildDetails();
        ArrayList result = instance.getChildDetails();
        //assertEquals(expResult, result);
        //assertEquals("Test Passed", expResult, result);
        assertNotNull(result);
        assertNotNull(expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("This test is set to fail");
    }
    
}
