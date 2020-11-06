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
 * toString() converts to English readable day of week
 */

/*
 *                        Design Pseudo-code
 * Input to method:
 * Month - 1-12 (will move to ENUM)
 *  Day of month 1-31
 * Data Structures:
 *   Epoch
 *   Year (initially 2020)
 * Day of Week (hard coded - 0-6)
 *
 * Days Since Dec 31
 *  indexed by month (0-11), month 0 = 0
 *  fields Month (String), # of days in month (int) & number of days since start of year (int - Jan 1 = 1, Feb 1 = 32)
 *
 * Algorithm
 *   Current day (#) of year = day of month + Day Of Year [month-1]   // e.g. Jan 12 = 12 + Days Since Dec31[0] = 12
 *
 *    Day of Week = (Epoch.Day of Week + current day (#) of year - 1)%Number of Days in a week
 *
 * Notes:
 *  since Jan 1 = 1, need to subtract 1 to adjust (e.g. Jan 1 = 0 days offset from Epoch day of week)
 *  months range = 1:12
 * day of week range is 0:6 (could do 1-7, but then need to adjust before & after to make modulo arithmetic work
*/
public class DayOfWeek_Calculator {
    final static String VERSION = "0.3.1";
    // deprecated in new version
    final static int[] DAYS_IN_MONTHS_LEAP = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    final static int[] DAY_OF_YEAR = new int [] {0, 31, 60, 91, 121, 152,182, 213, 244, 274, 305, 335};
    final static String[] intToDay = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    final static int EPOCH = 2020;
    final static int DEFAULT_YEAR = 2020;
    final static int EPOCH_DAY_WEEK = 3; // Wednesday, will subtract 1 in algorithm to adjust for Jan 1 = 0 days offset

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
    
    /**
     * 
     * @param month - month # - 1 to 12
     * @param day - day of month - 1 to 31
     * @return - day of week, 0 = Sunday, 6 = Saturday
     *    use toString() method to convert
     * ToDo: add Enum for day of week
     */
    public static int dayOfWeekCalculator(int month, int day) 
    {
        int dayOfYear = day + DAY_OF_YEAR[month-1];
        int returnValue = ((dayOfYear+EPOCH_DAY_WEEK-1) % 7);
        return (returnValue);
    }
    
    public static String toString(int dow) {
        return intToDay[dow];
    }
    
}
