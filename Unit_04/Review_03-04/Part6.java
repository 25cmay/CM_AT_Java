/* 
Caleb May
AT Java
Mr. Eng
 */


import java.util.Scanner;

public class Part6 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter three integers: ");
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();
        
        if (firstNumber > secondNumber & secondNumber > thirdNumber) {
            System.out.println("Numbers, " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ", are in order.");
        } else if ( firstNumber < secondNumber & secondNumber < thirdNumber) {
            System.out.println("Numbers, " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ", are in order.");
        } else {
            System.out.println("Numbers, " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ", are not in order.");
        }
    }
}