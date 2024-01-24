
/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList<Integer> temperatures = new ArrayList<>();

        while (in.hasNext()) {
            int temperature = in.nextInt();
            temperatures.add(temperature);
            }
        
        int lowesttemperature = Integer.MAX_VALUE;

        for (int temperature : temperatures) {
            if (temperature < lowesttemperature) {
                lowesttemperature = temperature;
            }
        }
        PrintWriter out = new PrintWriter("tempsOut.txt");
       
            for (int temperature : temperatures) {
                out.printf("%6d",temperature);
                if (temperature == lowesttemperature) {
                    out.print(" <= lowest");
                }
                out.println();
            }
        

        in.close();
        out.close();

    }
}
