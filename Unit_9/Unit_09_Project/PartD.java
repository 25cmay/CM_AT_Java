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
        Scanner in = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Ask the Magic 8 Ball a question (or 'q' to quit): ");
            userInput = in.nextLine();

            if (!userInput.equalsIgnoreCase("q")) {
                magic8Ball.shake();
                System.out.println("Magic 8 Ball says: " + magic8Ball.shake());
            }

        } while (!userInput.equalsIgnoreCase("q"));

        System.out.println("Exiting the Magic 8 Ball program.");
        
        in.close();

    }
}
