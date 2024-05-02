/* Caleb May
Mr. Eng
AT Java
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int maxvalues = 20;

        int[] values = new int[maxvalues];

        int size = 0;

        while (size < maxvalues) {
            System.out.print("Enter an integer value or press 'q' to quit (You can only enter 20 integer values): ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;    
            } else {
                values[size] = input.nextInt();
                size++;
            }
        }

        System.out.print("Values entered: ");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Enter a target integer value: ");
        int targetvalue = input.nextInt();

        int numbertargetvalue = 0;
        for (int i = 0; i < size; i++) {
            if (values[i] == targetvalue) {
                numbertargetvalue++;
            }
        }

        System.out.printf("The target value %d occurs %d times in your original data set.%n", targetvalue, numbertargetvalue);
    }
}
