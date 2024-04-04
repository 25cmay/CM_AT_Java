/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
public class PartA {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        System.out.printf("Speed = %d%n", b.getSpeed());
        b.pedal();
        b.pedal();
        System.out.printf("Speed (after pedaling) = %d%n", b.getSpeed());
        b.brake();
        System.out.printf("Speed (after breaking) = %d%n", b.getSpeed());
     
        GearedBicycle gb = new GearedBicycle();
        gb.shiftUp();
        gb.shiftUp();
        gb.pedal();
        gb.pedal();
        gb.pedal();
        System.out.printf("Geared Bike Speed = %d%n", gb.getSpeed());
        gb.brake();
        System.out.printf("Geared Bike Speed (after breaking) = %d%n", gb.getSpeed());
    }
    
}
