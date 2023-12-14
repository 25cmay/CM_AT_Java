/* Caleb May
Mr. Eng 
AT Java
 */
import java.util.Scanner;
public class Project1 {

    public static int leadingNumber(String section){
            int leadingNum = -1;
            int dotIndex = section.indexOf('.');
            if (dotIndex == -1) {
                leadingNum = Integer.parseInt(section);
                return leadingNum;
            } else {
                leadingNum = Integer.parseInt(section.substring(0, dotIndex));
                return leadingNum;
            }
        }
    
    public static String truncateSection(String section){
        int dotIndex = section.indexOf('.');
        if (dotIndex == -1) {
            return "";
        }
        String substring = section.substring(dotIndex + 1);
        return substring;
        }
    private static String compareSections(String section1, String section2) {
        String truncatedSection1 = truncateSection(section1);
        String truncatedSection2 = truncateSection(section2);

        if (truncatedSection1.isEmpty() == truncatedSection2.isEmpty()) {
            return section1;  
        } else if (truncatedSection1.isEmpty()) {
            return section1; 
        } else if (truncatedSection2.isEmpty()) {
            return section2; 
        } else {
            return whoIsFirst(truncatedSection1, truncatedSection2);
        }
    }

    public static String whoIsFirst(String section1, String section2){
        int leadingNumber1 = leadingNumber(section1);
        int leadingNumber2 = leadingNumber(section2);

        if (leadingNumber1 < leadingNumber2) {
            return section1;
        } else if (leadingNumber1 > leadingNumber2) {
            return section2;
        } else {
            return compareSections(section1, section2);
        }
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first section: ");
        String section1 = input.nextLine();

        System.out.print("Enter the second section: ");
        String section2 = input.nextLine();

        String first = whoIsFirst(section1, section2);

        System.out.println("Result: " + first);

    }


}

