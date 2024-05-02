/* Caleb May
Mr. Eng
AT Java
 */

import java.util.Arrays;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
        final int size = 10;
        int[] values = new int[size];

        int numberofvalues = 0;

        Scanner input = new Scanner(System.in);

        boolean looper = true;
        while (looper) {
            System.out.print("Enter an integer or press 'q' to quit: ");

            if (input.hasNext("q") || input.hasNext("Q")) {
                looper = false;
            } else {
                if (numberofvalues < values.length) {
                    values[numberofvalues] = input.nextInt();
                    numberofvalues = numberofvalues + 1;
                } else {
                    System.out.println("There's no more space. Can't input more integers.");
                    looper = false;
                }
        }
    }

    System.out.print("*");
        for (int i = 0; i < numberofvalues; i++) {
            System.out.print(values[i] + "*");
        }
        System.out.println();

       Arrays.sort(values, 0, numberofvalues);
        for (int i = 0; i < numberofvalues / 2; i++) {
            int reverse = values[i];
            values[i] = values[numberofvalues - 1 - i];
            values[numberofvalues - 1 - i] = reverse;
        }

        for (int i = 0; i < numberofvalues; i++) {
            if (i == numberofvalues - 1) {
                System.out.println(values[i]);
            } else {
                System.out.print(values[i] + ",");
            }
        }
    }
}