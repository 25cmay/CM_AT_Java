/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import Mystuff.Geometry;
import java.util.Scanner;

public class PartB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your sphere's radius: ");
        double r = in.nextDouble();
        double surfaceArea = Geometry.calcSurfSphere(r);
        double volume = Geometry.calcVolSphere(r);


        System.out.println("Your sphere with a radius of " + (int)r + ", has a surface area of " + (int)surfaceArea + ", and a volume of " + (int)volume);

    }
}