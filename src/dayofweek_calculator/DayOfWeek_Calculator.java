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
    final static String VERSION = "0.1";

    /**
     * @param args no command line args at this time
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Day of Week Calculator VERSION " + VERSION);
        System.out.println("");
        if (args.length == 2) {
            System.out.println(args[0] + args[1]);
        }
        System.out.println("Day of week for Dec 31 is " + dayOfWeek_Calculator(12, 31));
    }
    
    public static int dayOfWeek_Calculator(int month, int day) {
        return (7);
    }
    
}
