/* 
Caleb May
AT Java
Mr. Eng
 */

import java.util.Scanner;

public class Part7 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();

        for (int i = 0; i < phrase.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(phrase.charAt(i));
            } else {
                continue;
            }
        }

        System.out.println();

    }

}