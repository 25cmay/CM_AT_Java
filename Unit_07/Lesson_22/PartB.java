/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;

 public class PartB {
    public static void main(String[] args) {
        try {
            File file = new File("yob.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int spaceIndex = line.indexOf(',');
                String name = line.substring(0, spaceIndex);
                String birthYearString = line.substring(spaceIndex + 1);

                try {
                    if (birthYearString != "n/a") {
                        int birthYear = Integer.parseInt(birthYearString);
                        System.out.println(name + " was born in " + birthYear + ".");
                    } else {
                        System.out.println("I do not know what year " + name + " was born.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing birth year for " + name + ".");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}