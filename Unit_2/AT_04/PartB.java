import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // Get Variables
        System.out.print("Enter your phone number including you area code with no spaces or speial characters: ");
        String number = in.next();

        // Display information to user
        System.out.print("(");
        System.out.print(number.substring(0,3));
        System.out.print(")-");
        System.out.print(number.substring(3,6));
        System.out.print("-");
        System.out.print(number.substring(6,10));
     



    }
}