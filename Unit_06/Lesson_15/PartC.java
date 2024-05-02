/* Caleb May
Mr. Eng
AT Java
 */
import java.util.Arrays;
import java.util.Random;


public class PartC {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int maxvalues = 10000;
        int[] array = new int[maxvalues];
        Random rand = new Random();

        for (int i = 0; i < maxvalues; i++) {
            array[i] = rand.nextInt(maxvalues) + 1;
        }

        Arrays.sort(array);

        for (int i = 0; i < 10; i++) {
            int target = rand.nextInt(maxvalues) + 1;

            long startTime = System.currentTimeMillis();
            linearSearch(array, target);
            long endTime = System.currentTimeMillis();
            System.out.println("Linear search took " + (endTime - startTime) + " milliseconds.");
        }
    }
    
}
// The more values which are added the longer it takes to search it jumps larger and larger the bigger it gets, almost exponential