/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        // Set variables
        final double PIEPRICE = 10.00;
        final double DISCOUNT = .90;
        double total;

        System.out.print("How many pies would you like to buy? ");
        int piesBuying = in.nextInt();

        // Decide the price

        if (piesBuying < 3) {
            total = piesBuying * PIEPRICE;
            System.out.print("Your total for " + (int)piesBuying);
            System.out.printf(" pies is $%.2f", total);
        } else {
            total = piesBuying * PIEPRICE * DISCOUNT;
            System.out.print("Your total for " + (int)piesBuying);            
            System.out.printf(" pies is $%.2f", total);
        }


    }
}