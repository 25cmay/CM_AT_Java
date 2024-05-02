/* Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        Double discount = 0.0;
        if (num > 6) {
        discount = 0.05;
        } else if (num > 12) {
        discount = 0.10;
        }
        System.out.println("Discount = " + discount);  
        }

        
}
// Compile time error