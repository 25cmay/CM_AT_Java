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
        double cents;
        System.out.print("Enter your amount of money in dollar cent format (XX.xx): ");
        double money = in.nextDouble();
        
        // Calculate
        dollars = (int)money;
        money = money * 100;
        cents = money - (dollars*100);

        System.out.print("You have " + (int)dollars + " dollars and " + (int)cents + " cents");
    }
}