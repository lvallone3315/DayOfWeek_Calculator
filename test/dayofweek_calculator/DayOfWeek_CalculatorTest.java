/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayofweek_calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lvall
 */
public class DayOfWeek_CalculatorTest {
    
    final static String VERSION_JUNIT = "1.0";
    
    public DayOfWeek_CalculatorTest() {
        
    }
    
    @BeforeClass
    public static void setUpB4() {
        System.out.println("Version: " + VERSION_JUNIT + " Day of Week Junit Automated test");
        System.out.println("--- dayOfWeek_Calculator - Sunny Day 2020 ---");
    }
    
    @AfterClass
    public static void tearDownFinal() {
        System.out.println("--- dayOfWeek_Calculator Sunny Day testing complete ---");
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

        int month = 1;
        int day = 1;
        String expResult = "Wednesday";
        String result = DayOfWeek_Calculator.toString(DayOfWeek_Calculator.dayOfWeekCalculator(month, day));
        System.out.println("Testing Jan 1 2020 - expecting Wednesday (3) - positive & neg cases");
        assertEquals("Jan 1 = Wednesday", expResult, result);
        assertNotEquals("Jan 1 != Wednesday", expResult, result+1);
    }
    
    @Test
    public void testDayOfWeek_Calculator228() {
        System.out.println("Testing Feb 28 2020 - expecting Friday");
        assertEquals("Feb 28 = Friday", "Friday", DayOfWeek_Calculator.toString(DayOfWeek_Calculator.dayOfWeekCalculator(2,28)));
    }
    
    @Test
    public void testDayOfWeek_Calculator229() {
        System.out.println("Testing Feb 29 - expecting Saturday");
        assertEquals("Feb 29 = Saturday", "Saturday", DayOfWeek_Calculator.toString(DayOfWeek_Calculator.dayOfWeekCalculator(2,29)));
       
    }
    
    @Test
    public void testDayOfWeek_Calculator531() {
        System.out.println("Testing May 31 - expecting Sunday");
        assertEquals("May 31 = Sunday", "Sunday", DayOfWeek_Calculator.toString(DayOfWeek_Calculator.dayOfWeekCalculator(5,31)));
    }
    
    @Test
    public void testDayOfWeek_Calculator714() {
        System.out.println("Testing July 14 - expecting Tuesday");
        assertEquals("July 14 = Tuesday", "Tuesday", DayOfWeek_Calculator.toString(DayOfWeek_Calculator.dayOfWeekCalculator(7,14)));
    }
        
    @Test
    public void testDayOfWeek_Calculator930() {
        System.out.println("Testing Sept 30 = expecting Wednesday");
        assertEquals("Sept 30 = Wednesday", "Wednesday", DayOfWeek_Calculator.toString(DayOfWeek_Calculator.dayOfWeekCalculator(9,30)));
    }
    
    @Test
    public void testDayOfWeek_Calculator1123() {
        System.out.println("Testing Nov 23, 2020 = expecting Monday");
        assertEquals("Nov 23 = Monday", "Monday", DayOfWeek_Calculator.toString(DayOfWeek_Calculator.dayOfWeekCalculator(11,23)));
    }
    
    @Test
    public void testDayOfWeek_Calculator1231() {
        System.out.println("Testing Dec 31 = expecting Thursday");
        assertEquals("Dec 31 = Thursday", "Thursday", DayOfWeek_Calculator.toString(DayOfWeek_Calculator.dayOfWeekCalculator(12,31)));
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
