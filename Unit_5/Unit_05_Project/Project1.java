
/* Caleb May
Mr. Eng 
AT Java
*/
import java.util.Scanner;

public class Project1 {

    public static String whoIsFirst(String section1, String section2) {
        String work1 = section1;
        String work2 = section2;

        while (true) {
            if (work1.isEmpty()){
                return section1;
            } else if (work2.isEmpty()) {
                return section2;
            }
            int leadingNumber1 = leadingNumber(work1);
            int leadingNumber2 = leadingNumber(work2);

            if (leadingNumber1 < leadingNumber2) {
                return section1;
            } else if (leadingNumber1 > leadingNumber2) {
                return section2;
            }

            work1 = truncateSection(work1);
            work2 = truncateSection(work2);
        }

    }

    public static int leadingNumber(String section) {
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

    public static String truncateSection(String section) {
        int dotIndex = section.indexOf('.');
        if (dotIndex == -1) {
            return "";
        }
        String substring = section.substring(dotIndex + 1);
        return substring;
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
