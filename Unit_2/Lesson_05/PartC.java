/* Caleb May
 * AT Java
 * Mr. Eng
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PartC {
        static public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get info from user
        String name = JOptionPane.showInputDialog("Enter your name: "); 
        String number1 = JOptionPane.showInputDialog("Enter a number: ");
        String number2 = JOptionPane.showInputDialog("Enter a second number: ");

        // Calculate
        int intnumb1 = Integer.parseInt(number1);
        int intnumb2 = Integer.parseInt(number2);
        int sum = intnumb1 + intnumb2;

        JOptionPane.showMessageDialog(null, "Your name is " + name);
        JOptionPane.showMessageDialog(null, "The sum of your numbers is " + sum);


    }
}