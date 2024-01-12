/*
 * Caleb May
 * Mr.Eng
 * AT Java
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        // Declare Variables
        ArrayList<String> names = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        
        // Loop for names
        while (true) {
            System.out.print("Enter names and press # to stop: ");
            String name = input.nextLine();

            if (name.equals("#")) {
                break;
            }
            names.add(name);
        }
        
        System.out.println("Your names: ");
        for (String name : names) {
            System.out.println(name);

        }
    

        
    }    
}
