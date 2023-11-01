/* Caleb May
Mr. Eng
AT Java 
*/
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter all of your test scores. When you are done enter a negaitve number to get the average. ");

    double newscore;
    double scoreTotal = 0;
    int numberTest = 0;
    double average;


    do{
        System.out.println("Begin entering your scores: ");
        newscore = input.nextDouble();

         if (newscore <= -1) {
            break;
        } 
        
        numberTest = numberTest + 1;
        scoreTotal = scoreTotal + newscore;
    } while (newscore >= 0 );

    average = scoreTotal / numberTest;
    
    System.out.print("Your average is " + average);

    

    }
}