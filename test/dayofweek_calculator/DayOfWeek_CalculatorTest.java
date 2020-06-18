/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayofweek_calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lvall
 */
public class DayOfWeek_CalculatorTest {
    
    public DayOfWeek_CalculatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dayOfWeek_Calculator method, of class DayOfWeek_Calculator.
     */
    @Test
    public void testDayOfWeek_Calculator() {
        System.out.println("dayOfWeek_Calculator");
        int month = 0;
        int day = 0;
        int expResult = 7;
        int result = DayOfWeek_Calculator.dayOfWeek_Calculator(month, day);
        assertEquals(expResult, result);
        assertNotEquals(expResult, result+1);
    }
    
}
