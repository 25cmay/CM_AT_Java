/* Caleb May
Mr. Eng
AT Java 
*/
import java.util.Scanner;

public class PartC {

    public static double volumer(double radius) {
        double volume;
        volume = Math.pow(radius, 3);
        volume = volume * 4.0/3.0 * Math.PI;
        return volume;

    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the radius of your sphere: ");
        double radius = input.nextDouble();

        double volume = volumer(radius);
        System.out.println("The volume of your sphere is " + volume);

    }
}
