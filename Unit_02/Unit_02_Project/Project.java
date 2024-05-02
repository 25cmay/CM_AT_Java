/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

public class Project {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // Set Variables
        
        System.out.print("Enter the time in seconds: ");
        int time = in.nextInt();

        final int SECINHOUR = 3600;
        final int SECINMINUTE = 60;
        final int SECINSECOND = 1;

        int hours;
        int minutes;
        int seconds;

        // Calculate
        hours = time / SECINHOUR;
        time = time - (SECINHOUR * hours);
        minutes = time / SECINMINUTE;
        time = time - (SECINMINUTE * minutes);
        seconds = time / SECINSECOND;
        time = time - (SECINSECOND * seconds);
       
        System.out.printf("The time is: %02d", hours);
        System.out.printf(":%02d", minutes);
        System.out.printf(":%02d%n", seconds);
    }
}