/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

class DoorSystem {
    // dash switches
    boolean dashLeft = false;
    boolean dashRight = false;

    // Inside handles
    boolean insideLeft = false;
    boolean insideRight = false;

    // Outside handles
    boolean outsideLeft = false;
    boolean outsideRight = false;

    // Master Switch true is unlock
    boolean masterUnlock = true;

    // Child switch 
    // True = inside switches doesnt work
    boolean childLock = false;

    // Gear Shift
    enum GearState {PARK, DRIVE, GEAR1, GEAR 2, GEAR3, NEUTRAL, REVERSE}
    GearState currentGear = GearState.Park;

    // create a method
    public void updateState(String newState) {


        // Dash left
        if (newState.lenght() >= 9) {
            if (newState.charA(0) == 1) {
                dashLeft = true;
            } else {
                dashLeft = false;
            }
        }
    }

 }






import java.util.Scanner;

public class Project {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
    }
}