/* Caleb May
Mr. Eng
AT Java
 */ 
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        // Account 1
        System.out.print("Enter the first account ID: ");
        int accountID_1 = in.nextInt();

        System.out.print("Enter the first accound balance ($): ");
        double accountBalance_1 = in.nextDouble();

       // Account 2
        System.out.print("Enter the first account ID: ");
        int accountID_2 = in.nextInt();

        System.out.print("Enter the first accound balance ($): ");
        double accountBalance_2 = in.nextDouble();

        // Account 3
        System.out.print("Enter the first account ID: ");
        int accountID_3 = in.nextInt();

        System.out.print("Enter the first accound balance ($): ");
        double accountBalance_3 = in.nextDouble();

        System.out.printf("Account %06d ", accountID_1);
        System.out.printf("has $%,15.2f%n", accountBalance_1);
        System.out.printf("Account %06d ", accountID_2);
        System.out.printf("has $%,15.2f%n", accountBalance_2);
        System.out.printf("Account %06d ", accountID_3);
        System.out.printf("has $%,15.2f%n", accountBalance_3);
    }
}
