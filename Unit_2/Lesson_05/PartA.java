/* Caleb May
 * AT Java
 * Mr. Eng
 */

import java.util.Scanner;

public class PartA {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get three names from user
        System.out.print("Enter your first name: ");
        String firstname = input.next();
        System.out.print("Enter your middle name: ");
        String middlename = input.next();
        System.out.print("Enter your last name: ");
        String lastname = input.next();
        // Get monogram
        String firstletter = firstname.substring(0,1);
        String secondletter = middlename.substring(0,1);
        String thirdletter = lastname.substring(0,1);


        // Display monogram to user
        System.out.print(firstname + (" ") + middlename + (" ") + lastname + " your monogram is " );
        System.out.println(firstletter + secondletter + thirdletter);

        

    }
}