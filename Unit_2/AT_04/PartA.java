/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // Get Variables
        double dollars;
        int cents;
        System.out.print("Enter your amount of money in dollar cent format (XX.xx): ");
        double money = in.nextDouble();
        
        // Calculate
        dollars = money % 100;
        money = cents;

        System.out.print("You have " + dollars + "dollars and " + cents + "cents.");

    }
}