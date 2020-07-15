/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayofweek_calculator;

/**
 * Day of Week Calculator
 *   Returns day of week for specified month & day
 * @author pippy & Lee
 */
public class DayOfWeek_Calculator {
    final static String VERSION = "0.2.2";
    final static int[] DAYS_IN_MONTHS_LEAP = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * @param args no command line args at this time
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Day of Week Calculator VERSION " + VERSION + "\n\n");
        int month = 11;
        int day = 5;
        int year = 2020;
        System.out.println("day " + day + " of month " + month + " is " + dayOfWeekCalculator(month, day) + " in year " + year);
    }
    
    public static int dayOfWeekCalculator(int month, int day) 
    {
        int daysSinceNewYears = 0;
        for (int index = 1; index < month; index++) 
        {
            daysSinceNewYears += DAYS_IN_MONTHS_LEAP[index-1];
            //System.out.println(daysSinceNewYears);
        }
        daysSinceNewYears += day;
        int returnValue = (daysSinceNewYears % 7) + 2;
        return (returnValue);
    }
    
}
