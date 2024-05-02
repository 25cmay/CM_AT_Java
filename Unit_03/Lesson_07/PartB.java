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

        System.out.println("What is your age? ");
        int age = input.nextInt();

        System.out.print("Enter day of the week (0 = SUN, ..., 6 = SAT): ");
        double cost = input.nextDouble();

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

        double discount = 0.0;

        if (today == DayOfWeek.MONDAY) {
            if (age < 13) {
                discount = .075;
            } else if (age >= 50) {
                discount = .15;
            } else {
                discount = .05;
            }
        } else if (today == DayOfWeek.TUESDAY) {
            discount = 0.0;
        } else { 
            if (age < 13) {
                discount = .05;
            } else if (age >= 50) {
                discount = .075;
            }
        }
        
        double addediscount = cost - (cost * discount);
        System.out.println("The cost of your meal is $" + addediscount);
    }
}