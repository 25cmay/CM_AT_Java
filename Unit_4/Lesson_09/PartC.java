/* Caleb May
Mr. Eng
AT Java 
*/
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner (System.in);

    double total = 0;
    double times = 0;
    double average;
    int n;

    System.out.println("Your numbers are : ");

    for (int i = 1; i <= 10; i++) {
        double r = Math.random();
        r = r * 10 + 1;
        n = (int)r;
        System.out.println(n);
        total = total + n;
        times = times + 1;


    }
    average = total / times;
        System.out.println(average);
    
    }
}