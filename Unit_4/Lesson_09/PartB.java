/* Caleb May
Mr. Eng
AT Java 
*/
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter your favorite phrase: ");
    String phrase = input.nextLine();

    int eCounter = 0;
    int i;

    for (i = 0; i < phrase.length(); i++) {
        if (phrase.charAt(i) == 'e') {
            eCounter++;

        }
    }
    System.out.println("Your phrase has " + eCounter + " 'e's in it.");


    }
}