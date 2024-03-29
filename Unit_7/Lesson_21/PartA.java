/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("top5unemployment.txt"); 
        Scanner in = new Scanner(inputFile).useDelimiter("[,\\s\\n]+");

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates                    ");
        System.out.println("---------------------------------------------------------------");


        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\\n]+");
            String name = lineScanner.next().trim();
            String nextWord = lineScanner.next().trim();
            double percentage = Double.valueOf(nextWord);
            nextWord = lineScanner.next().trim();
            int rank = Integer.valueOf(nextWord);
            String region = lineScanner.next().trim();
 
            System.out.printf("Ranked #%3d: %16s | %6.2f%% | %20s%n",
                    rank, name, percentage, region);
        }
    }
}