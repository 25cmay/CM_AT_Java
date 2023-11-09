/* 
Caleb May
 * AT Java
 * Mr. Eng
 */


import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        int currentNumber = 2;
        int total = 0;

        while (currentNumber <= 100) {
            total = total + currentNumber;
            // System.out.println(total + "   " + currentNumber);
            currentNumber ++;
        }
        System.out.println(total);
    }
}
