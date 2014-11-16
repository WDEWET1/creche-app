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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author TaswellSalie
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.wesley.creche.services.FinancialServices.AddExpensesServiceTest.class, com.wesley.creche.services.FinancialServices.GetIncomeServiceTest.class, com.wesley.creche.services.FinancialServices.UpdateFeesServiceTest.class, com.wesley.creche.services.FinancialServices.GetExpensesServiceTest.class, com.wesley.creche.services.FinancialServices.ChildBalanceServiceTest.class, com.wesley.creche.services.FinancialServices.AddIncomeServiceTest.class, com.wesley.creche.services.FinancialServices.MonthFromStringToNumberTest.class})
public class NewTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
