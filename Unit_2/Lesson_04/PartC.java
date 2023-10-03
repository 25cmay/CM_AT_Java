/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        double surface_area;
        double volume;

        // Inputs
        System.out.print("Enter the length of the box: ");
        double length = in.nextDouble();
        System.out.print("Enter the width of the box: ");
        double width = in.nextDouble();
        System.out.print("Enter the height of the box: ");
        double height = in.nextDouble();

        // Calculate
        surface_area = 2 * (width * height + height * length + height * width);
        volume = length * width * height;

        // Display
        System.out.printf("Length       = %,10.2f%n", length);
        System.out.printf("Width        = %,10.2f%n", width);
        System.out.printf("Height       = %,10.2f%n", height);
        System.out.printf("Volume       = %,10.2f%n", volume);
        System.out.printf("Surface Area = %,10.2f%n", surface_area);
    }
}