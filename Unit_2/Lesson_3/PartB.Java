// Caleb May
// AT Java
// Mr. Eng

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Declare Cents
        int cents;

        // Ask for cents
        System.out.print("Enter your total amount in cents:");
        cents = input.nextInt();
        System.out.println("You started out with this many cents: " + cents);


        
        // Declare constants
        final int QUARTER_VALUE = 25;  // VALUE OF QUARTERS
        final int DIME_VALUE = 10;    // VALUES OF DIMES
        final int NICKLE_VALUE = 5;   // VALUE OF NICKELS
    
        // Declare variables to tracck how many coins we have
        int q;   // ANumber of quarters
        int d;   // Number of dimes
        int n;   // Number of nickels
        int p;   // Number of pennies

        // Calculate how many quarters we have
        q = cents / QUARTER_VALUE;
        cents = cents % QUARTER_VALUE;
        
        // Calculate how many dimes we have
        d = cents / DIME_VALUE;
        cents = cents % DIME_VALUE;

        // Calculate how many nickels we have
        n = cents / NICKLE_VALUE;
        cents = cents % NICKLE_VALUE;

        // Calculate pennies
        p = cents / 1;

        // Display to user
        System.out.println("You have " + q + " quarters, " + d + " dimes, " + n + " nickels, " + p + " pennies. ");

    }
}