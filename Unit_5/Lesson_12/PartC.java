/* Caleb May
Mr. Eng
AT Java 
*/
import java.util.Scanner;

public class PartC {
    public static boolean voweler(char letter) {
        if (letter == 'A' || letter == 'a') {
            return true;
        } else if (letter == 'E' || letter == 'e') {
            return true;
        } else if (letter == 'I' || letter == 'i') {
            return true;
        } else if (letter == 'O' || letter == 'o') {
            return true;
        } else if (letter == 'U' || letter == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static int countVowels(String phrase){
        int vowelCounter = 0;

        for (int i = 0; i < phrase.length(); i++) {
        boolean vowel = voweler(phrase.charAt(i));
        
            if (vowel == true) {
                vowelCounter = vowelCounter + 1;
            }
        }
        return vowelCounter;


    }

    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner (System.in);
        
        //Initialize Variables
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();

        int vowelcount = countVowels(phrase);

        System.out.println("Your phrase, " + phrase + ", has " + vowelcount + " vowels.");

        

    }
}