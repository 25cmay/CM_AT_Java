/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        // prompt user for age.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // are they lucky?
        if (age == 13) {
        System.out.println("Lucky 13!");
        }

    }
}