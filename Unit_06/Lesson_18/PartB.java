/*
 * Caleb May
 * Mr.Eng
 * AT Java
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> scores = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        int numberscores = 0;
        double totalscore = 0;

        while (true) {
            System.out.print("Enter quiz scores or type 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            } else {
                double score = input.nextDouble();
                scores.add(score);
                totalscore += score;
                numberscores++;
            }
        }

        System.out.println("Test scores that you entered:");
        for (Double score : scores) {
            System.out.printf("%.2f%n", score);
        }

        if (numberscores > 0) {
            double averagescore = totalscore / numberscores;
            System.out.printf("Average score: %.2f%n", averagescore);
        } else {
            System.out.println("No scores entered.");
        }
    }
}