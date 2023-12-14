/* Caleb May
Mr. Eng 
AT Java
 */
import java.util.Scanner;
public class Project2 {


    public static String getEncodedDigit(int d){
        // Converts numerical digit to barcode value as string
       String result;
        if (d == 1) {
            result = ":::||";
        } else if (d == 2) {
            result = "::|:|";
        } else if (d == 3) {
            result = "::||:";
        } else if (d == 4) {
            result = ":|::|";
        } else if (d == 5) {
            result = ":|:|:";
        } else if (d == 6) {
            result = ":||::";
        } else if (d == 7) {
            result = "|:::|";
        } else if (d == 8) {
            result = "|::|:";
        } else if (d == 9) {
            result = "|:|::";
        } else if (d == 0) {
            result = "||:::";
        } else {
            result = "";
        }
        return result;
    } 
    public static int getCheckDigit(String zipCode){
        // takes zipcode as string and calculates the sum of the numbers
        int sum = 0;
        char c;
        int val;
        
        // go through zip code adding numbers
        for(int i = 0; i < 5; i++){
            // get character
            c = zipCode.charAt(i);

            // convert to int
            val = Integer.valueOf(c);
            // Add to sum
            sum = sum + val;

        }
        
        // take modulo of sum
        int mod = sum % 10;
        if (mod == 0) {
            return 0;
        } else {
            return 10 - sum;
        }


    }
    public static String getBarCode(String zipCode) {
        String result = "|";
        for (int i = 0; i < zipCode.length(); i++) {
            int d = Integer.valueOf(zipCode.substring(i, i + 1));
            result = result + getEncodedDigit(d);
        }
        result = result + getEncodedDigit(getCheckDigit(zipCode));
        result = result + "|";

        return result;

    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a zipcode: ");
        String zipcode = input.nextLine();
        System.out.println(getBarCode(zipcode));


    }




    
}
