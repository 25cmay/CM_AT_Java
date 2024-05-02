/* 
Caleb May
 * AT Java
 * Mr. Eng
 */


import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
    
        System.out.println("Enter three integers: ");
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();
        
        if (firstNumber <= secondNumber & firstNumber <= thirdNumber) {
            if (secondNumber <= thirdNumber) {
                System.out.println("Numbers, " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ", are in increasing order");
            }
            else{
                System.out.println("Numbers, " + firstNumber + ", " + thirdNumber + ", " + secondNumber + ", are in increasing order");
            }
        } else if (secondNumber <= firstNumber & secondNumber <= thirdNumber) {
            if (firstNumber <= thirdNumber) {
                System.out.println("Numbers, " + secondNumber + ", " + firstNumber + ", " + thirdNumber + ", are in increasing order");
            }
            else{
                System.out.println("Numbers, " + secondNumber + ", " + thirdNumber + ", " + firstNumber + ", are in increasing order");
            }
        } else {
            if (firstNumber <= secondNumber) {
                System.out.println("Numbers, " + thirdNumber + ", " + firstNumber + ", " + secondNumber + ", are in increasing order");
            }
            else{
                System.out.println("Numbers, " + thirdNumber + ", " + secondNumber + ", " + firstNumber + ", are in increasing order");
            }

        }
    }
}