/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

import java.util.Random;

public class Project1 {
    public static void main(String[] args) throws Exception {
        // Get arrays and random numbers
        int[] numbers = new int[10];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        // Print even index
        System.err.println("Numbers at even indices"); 
        for(int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print every index
        System.out.println("Even elements:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Print reverse order
        System.out.println("Elements in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print first and last
        System.out.println("First and last element:");
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[numbers.length - 1]);
        System.out.println();

    }
}