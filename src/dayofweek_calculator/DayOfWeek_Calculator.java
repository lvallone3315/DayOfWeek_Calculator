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
 * 
 * Sunday = 0, Saturday = 6
 */
public class DayOfWeek_Calculator {
    final static String VERSION = "0.2.3";
    final static int[] DAYS_IN_MONTHS_LEAP = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final static String[] intToDay = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    /**
     * @param args no command line args at this time
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Day of Week Calculator VERSION " + VERSION + "\n\n");
        int month = 1;
        int day = 1;
        int year = 2020;
        System.out.println("day " + day + " of month " + month + " is " + 
                toString(dayOfWeekCalculator(month, day)) + " in year " + year);
    }
    
    public static int dayOfWeekCalculator(int month, int day) 
    {
        int daysSinceNewYears = 0;
        for (int index = 1; index < month; index++) 
        {
            daysSinceNewYears += DAYS_IN_MONTHS_LEAP[index-1];
        }
        daysSinceNewYears += day;
        // int returnValue = (daysSinceNewYears % 7) + 2;
        int returnValue = ((daysSinceNewYears+2) % 7);
        return (returnValue);
    }
    
    public static String toString(int dow) {
        return intToDay[dow];
    }
    
}
