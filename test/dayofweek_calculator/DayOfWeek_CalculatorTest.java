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
    public void testDayOfWeek_CalculatorJan01() {
        System.out.println("dayOfWeek_Calculator");
        int month = 1;
        int day = 1;
        int expResult = 3; // Wednesday
        int result = DayOfWeek_Calculator.dayOfWeek_Calculator(month, day);
        assertEquals(expResult, result);
        assertNotEquals(expResult, result+1);
    }
    
    @Test
    public void testDayOfWeek_Calculator228() {
        System.out.println("Testing Feb 28");
        assertEquals(5, DayOfWeek_Calculator.dayOfWeek_Calculator(2,28));
    }
    
    @Test
    public void testDayOfWeek_Calculator229() {
        System.out.println("Testing Feb 29");
        assertEquals(6, DayOfWeek_Calculator.dayOfWeek_Calculator(2,29));
    }
    
    @Test
    public void testDayOfWeek_Calculator531() {
        System.out.println("Testing May 31");
        assertEquals(0, DayOfWeek_Calculator.dayOfWeek_Calculator(5,31));
    }
    
    @Test
    public void testDayOfWeek_Calculator714() {
        System.out.println("Testing July 14");
        assertEquals(2, DayOfWeek_Calculator.dayOfWeek_Calculator(7,14));
    }
        
    @Test
    public void testDayOfWeek_Calculator930() {
        System.out.println("Testing Sept 30");
        assertEquals(3, DayOfWeek_Calculator.dayOfWeek_Calculator(9,30));
    }
    
    @Test
    public void testDayOfWeek_Calculator1123() {
        System.out.println("Testing Nov 23");
        assertEquals(1, DayOfWeek_Calculator.dayOfWeek_Calculator(11,23));
    }
    
    @Test
    public void testDayOfWeek_Calculator1231() {
        System.out.println("Testing Dec 31");
        assertEquals(4, DayOfWeek_Calculator.dayOfWeek_Calculator(12,31));
    }
    
    /*
    @Test
    public void testDayOfWeek_Calculator_ArrayVersion() {
        class testArray {
            private int month;
            private int day;
            private int expected_result;
            private int error_result;
            
            public testArray(int m, int d, int expected, int error) {
                this.month = m;
                this.day = d;
                this.expected_result = expected;
                this.error_result = error;
            }
        }
            
        // initialize our test array
        testArray[] test = new testArray[] {new testArray(1,1,7,4), 
            new testArray(1,31,6,2)};
        
        // test it
        int result;
        int expResult;
        for (int index = 0; index < test.length; index++) {
            result = DayOfWeek_Calculator.dayOfWeek_Calculator(
                    test[index].month, test[index].day);
            expResult = test[index].expected_result;
            System.out.printf ("Testing month %d  day %d\tresult %d\n",
                    test[index].month, test[index].day, test[index].expected_result);
            assertEquals(expResult, result);
            // assertNotEquals(expResult, result+1);
        }
       
    }
    */
    
}
