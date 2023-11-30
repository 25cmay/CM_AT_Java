/* Caleb May
Mr. Eng
AT Java 
*/
import java.util.Scanner;

public class PartB {
   public static double smallest(double x, double y, double z) {
      // test x
      if (x < y && x < z) {
         return x;
         // test y
      } else if (y < x && y < z) {
         return y;
         // test z
      } else if (z < x && z < y) {
         return z;
         // same values
      } else {
         if (x < z && x == y) {
            return x;
         } else if (x < y && x == z) {
            return x;
         } else {
            return z;
         }
      }
   }
   public static void main(String[] args) throws Exception {
      Scanner input = new Scanner (System.in);

      {
      System.out.println("x = 10, y = 7, z = 9");
      double x = 10;
      double y = 7;
      double z = 9;
      double small = smallest(x, y, z);
      System.out.println((int)small + " is the smallest number");
      }

      {
      System.out.println("x = 1, y = 1, z = 4");
      double x = 1;
      double y = 1;
      double z = 4;
      double small = smallest(x, y, z);
      System.out.println((int)small + " is the smallest number");
      }

      {
      System.out.println("x = -1, y = 5, z = 2");
      double x = -1;
      double y = 5;
      double z = 2;
      double small = smallest(x, y, z);
      System.out.println((int)small + " is the smallest number");
      }

      {
      System.out.println("x = 1, y = 7, z = 0");
      double x = 1;
      double y = 7;
      double z = 0;
      double small = smallest(x, y, z);
      System.out.println((int)small + " is the smallest number");
      }

      {
      System.out.println("x = 8, y = 4, z = 1");
      double x = 8;
      double y = 4;
      double z = 1;
      double small = smallest(x, y, z);
      System.out.println((int)small + " is the smallest number");
      }
   }
}

    
    
    