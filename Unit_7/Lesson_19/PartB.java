/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
    ArrayList<Double> scores = new ArrayList<>();
    double total = 0;
    
    File inputFile = new File("quizzes.txt");
    Scanner in = new Scanner(inputFile);

    PrintWriter out = new PrintWriter("quizzesOut.txt");

    while (in.hasNextDouble()) {
        double score = in.nextDouble();
        scores.add(score);
        total += score;
    }

    for (int i = 0; i < scores.size(); i++) {
            String formattedScore = String.format("Quiz %03d: %.2f", i, scores.get(i));
            out.println(formattedScore);
        }
        
        double average = total / scores.size();

        out.println("----------------");
        out.printf("Average:   %6.2f", average);

        in.close();
        out.close();

        System.out.println("Processing completed successfully.");
    }
}