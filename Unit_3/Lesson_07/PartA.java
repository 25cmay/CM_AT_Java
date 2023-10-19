/* Caleb May
 * AT Java
 * Mr. Eng
 */

import java.util.Scanner;

public class PartA {
    // Create a Day of the Week Enumeration
    public enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the Day of the Week.
        System.out.print("Enter day of the week (0 = SUN, ..., 6 = SAT): ");
        int val = input.nextInt();
        DayOfWeek today;

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
            System.out.println("Enter the age of the customer: ");
            int age = input.nextInt();
            if (age < 13 ) {
                
            }
        }

    }
}