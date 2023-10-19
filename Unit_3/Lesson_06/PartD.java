/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        // Set variables
        final double COOKIEPRICE = 0.99;
        final double DISCOUNT6 = .975;
        final double DISCOUNT12 = .95;
        final double DISCOUNT24 = .85;
        double total;

        System.out.print("How many pies would you like to buy? ");
        int cookiesBuying = in.nextInt();

        // Decide the price

        if (cookiesBuying > 6) {
            total = cookiesBuying * COOKIEPRICE * DISCOUNT6;
            System.out.print("Your total for " + cookiesBuying);
            System.out.printf(" pies is $%.2f", total);
        } else if (cookiesBuying > 12) {
            total = cookiesBuying * COOKIEPRICE * DISCOUNT12;
            System.out.print("Your total for " + cookiesBuying);
            System.out.printf(" pies is $%.2f", total);
        } else if (cookiesBuying > 24) {
            total = cookiesBuying * COOKIEPRICE * DISCOUNT24;
            System.out.print("Your total for " + cookiesBuying);
            System.out.printf(" pies is $%.2f", total);
        } else {
            total = cookiesBuying * COOKIEPRICE;
            System.out.printf("Your total for ", cookiesBuying);
            System.out.printf(" pies is $%.2f", total);
        }


    }
}