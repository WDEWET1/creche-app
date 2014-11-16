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
public class UpdateFeesServiceTest {
    
    public UpdateFeesServiceTest() {
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
     * Test of updateChildFees method, of class UpdateFeesService.
     */
    @Test
    public void testUpdateChildFees() throws Exception {
        System.out.println("updateChildFees");
        double updatedAmount = 120.00;
        int fees_id = 1;
        double overDueAmount =120.00;
        UpdateFeesService.updateChildFees(updatedAmount, fees_id,overDueAmount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("This test is set to fail.");
        
        
    }
    
}
