/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

public class PartA {
    public static void main(String[] args) throws Exception {
        double quantity = 100;
        int numyears = 0; 
        while(quantity >= 1){
            quantity = quantity / 2;
            numyears += 1;
            System.out.println("After " + numyears * 30 + " years there is " + quantity + "% of the original amount of Cesium 90.");

        }

    }
}