/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

import org.derryfield.toys.Magic8Ball;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Magic8Ball magic8Ball = new Magic8Ball();
        Scanner scanner = new Scanner(System.in);

        char choice;
        while (Character.toLowerCase(choice) != 'n') {
            System.out.println("Ask the Magic 8 Ball a question: ");
            if (scanner.hasNextLine() == true) {
                System.out.println("Shaking the Magic 8 Ball...");
                String answer = magic8Ball.shake();
                System.out.println("The Magic 8 Ball says: " + answer);
            }
            System.out.println("Ask another question? (y/n)");
            choice = scanner.nextLine().charAt(0);
        } 

        scanner.close();
    }
}
