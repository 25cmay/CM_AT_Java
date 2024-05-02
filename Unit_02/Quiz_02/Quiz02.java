// Caleb May
// AT Java
// Mr. Eng

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
// Declare Variables
        String name;
        double num1;
        double num2;
        double num3;

// Get inputs
        System.out.println("Enter your name: ");
        name = input.next();
        System.out.println("Hello " + name + "! Enter your first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter your second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter your third number: ");
        num3 = input.nextDouble();
// Print for the user
        System.out.printf("x = %8.3f%n", num1);
        System.out.printf("y = %8.3f%n", num2);
        System.out.printf("z = %8.3f%n", num3);
    }
}

