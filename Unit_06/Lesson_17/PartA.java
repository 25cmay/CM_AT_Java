/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

public class PartA {
    public static void main(String[] args) throws Exception {
    int[][] array1 = new int[4][3];
    int[][] array2 = new int[2][5];
    int[][] array3 = {
            {8, 6, 7}, 
            {5, 3, 0}
        };
        print(array1);
        print(array2);
        print(array3);
    }
    public static void print(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                System.out.println(values[i][j]);
            }
        }
    }

}

  