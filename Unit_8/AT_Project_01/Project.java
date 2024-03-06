/*
 * Caleb May
 * Mr.Eng
 * AT Java
 */

import java.util.Scanner;

import mow.Yard;
import mow.Mower;

public class Project {

    // method to clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // method to delay showing yard
    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {
        clearScreen(); // Clear the screen

        // Initalize Scanner
        Scanner in = new Scanner(System.in);

        // Prompt user for dimensions of the lawn
        System.out.print("Enter the height of the yard: ");
        int height = in.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = in.nextInt();

        // Create Yard object
        Yard yard = new Yard(height, width);

        // Print Yard without mower
        yard.printYard();
        System.out.println();

        // Get row
        System.out.print("Enter a starting row in your yard between 0 and " + (height - 1) + ": ");
        int mrow = in.nextInt();
        
        // Get column
        System.out.print("Enter a starting column in your yard between 0 and " + (width - 1) + ": ");
        int mcolumn = in.nextInt();

        // Get direction
        System.out.print("Enter a starting direction for your mower. 0 is up, 1 is right, 2 is down, 3 is left: ");
        int mdirection = in.nextInt();

        // Print yard with mower
        Mower mower = new Mower(mrow, mcolumn, mdirection);
        yard.printYard(mower);

        // cut one row.
        while (true) {
            mower.cutGrass(yard);
            if (mower.checkGrass(yard)) {
            mower.moveForward();
            } else { 
                break;
            }
            Project.clearScreen();
            yard.printYard(mower);
            Project.delay(500);
            

        }

       // mower.cutGrass(yard);
        in.close();
    }

}