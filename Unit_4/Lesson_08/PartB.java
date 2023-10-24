/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        // Get varibles
        double interest = 0;

        // APR
        System.out.print("Enter your APR as a percentage: ");
        double APR = in.nextDouble();
        APR = APR / 100;

        // Inital Balance
        System.out.print("Enter your inital balance: ");
        double initalBalance = in.nextDouble();
        

        // Print Heading
        System.out.println(" Year |         INT Earned ($)         |          Balance ($)          ");
        System.out.println("-----------------------------------------------------------------------");
        
        // Create Loop
        for (int year = 1; year <= 5; year++) {
            interest = initalBalance * APR;
            initalBalance += interest;
            System.out.printf("   %d              %8.2f                     %8.2f          %n", year, interest, initalBalance);
        }
        
    }
}
