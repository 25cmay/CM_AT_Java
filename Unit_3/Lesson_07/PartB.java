/* Caleb May
 * AT Java
 * Mr. Eng
 */

import java.util.Scanner;

public class PartB {
    // Create a Day of the Week Enumeration
    public enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare Variables 
        final double monKidDis = .025;
        final double monSeniorDis = .15;
        final double monRegDis = .05;

        // Get the Day of the Week.
        System.out.print("Enter day of the week (0 = SUN, ..., 6 = SAT): ");
        int val = input.nextInt();
        DayOfWeek today;

        System.out.print("Enter day of the week (0 = SUN, ..., 6 = SAT): ");
        double subtotal = input.nextDouble();

        if (val == 0) {
            today = DayOfWeek.SUNDAY;
        } else if (val == 1) {
            today = DayOfWeek.MONDAY;
        } else if (val == 2) {
            today = DayOfWeek.TUESDAY;
        } else if (val == 3) {
            today = DayOfWeek.WEDNESDAY;
        } else if (val == 4) {
            today = DayOfWeek.THURSDAY;
        } else if (val == 5) {
            today = DayOfWeek.FRIDAY;
        } else {
            today = DayOfWeek.SATURDAY;
        }

        if (today == DayOfWeek.MONDAY) {
            System.out.println("You qualify for our Monday discount!");
        
        }
       

    }
}