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

        File inputFile = new File("billionaires.txt");
        Scanner in = new Scanner(inputFile).useDelimiter("[;\\s\\n]+");

        while (in.hasNextLine()) {

            // Get lines
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[;\\n]+");


            // Get Name
            String name = lineScanner.next().trim();
            name = name.trim();
            // Money
            String nextWord = lineScanner.next().trim();
            nextWord = nextWord.replaceAll("\\$", "");
            String money = nextWord;

            // Taxrated
            nextWord = nextWord.replaceAll(",", "");
            double worth = Double.valueOf(nextWord);
            double taxrated = worth * .03;

            // Country
            String country = lineScanner.next().trim();
            
            
            // Print
            System.out.printf("%-20s: |$ %20s |$ %20.2f | %-20s %n", name, money, taxrated, country);
                
        }
    }
} 