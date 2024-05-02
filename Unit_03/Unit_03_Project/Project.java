/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.util.Scanner;

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
    enum GearState {PARK, DRIVE, GEAR1, GEAR2, GEAR3, NEUTRAL, REVERSE}
    GearState currentGear = GearState.PARK;

    // create a method
    public void updateState(String newState) {

    
        // Dash left
        if (newState.charAt(0)=='1'){
            dashLeft = true;
        } else {
            dashLeft = false;
        }
        
        // Dash Right
        if (newState.charAt(1)=='1'){
            dashRight = true;
        } else {
            dashRight = false;
        } 
        
        // Inside Left
        if (newState.charAt(2)=='1'){
            insideLeft = true;
        } else {
            insideLeft = false;
            }
        
        // Inside Right    
        if (newState.charAt(3)=='1'){
            insideRight = true;
        } else {
            insideRight = false;
        }

        // Outside Left
        if (newState.charAt(4)=='1'){
            outsideLeft = true;
        } else {
            outsideLeft = false;
        }

        // Outside Right
        if (newState.charAt(5)=='1'){
            outsideRight = true;
        } else {
            outsideRight = false;
        }
        
        // Master Lock
        if (newState.charAt(6)=='1'){
            masterUnlock = true;
        } else {
            masterUnlock = false;
        }

        // Child Lock
        if (newState.charAt(7)=='1'){
            childLock = true;
        } else {
            childLock = false;
        }

        // Gear State
        if(newState.charAt(8)=='P'){
            currentGear = GearState.PARK;
        } else if (newState.charAt(8)=='D'){
            currentGear = GearState.DRIVE;
        } else if (newState.charAt(8)=='1'){
            currentGear = GearState.GEAR1;
        } else if (newState.charAt(8)=='2'){
            currentGear = GearState.GEAR2;
        } else if (newState.charAt(8)=='3'){
            currentGear = GearState.GEAR3;
        } else if (newState.charAt(8)=='N'){
            currentGear = GearState.NEUTRAL;
        } else if (newState.charAt(8)=='R'){
            currentGear = GearState.REVERSE;
        } 
    }

    // Left Door Check
    public boolean leftDoorStatus (){
        if (masterUnlock == true){
            if (currentGear == GearState.PARK) {
                if (childLock == false){
                    if (dashLeft == true){
                        return true;
                    }
                    if (insideLeft == true){
                        return true;
                    }
                    if (outsideLeft == true){
                        return true;
                    }
                } else {
                    if (insideLeft == false){
                    return false;
                    }
                    if (outsideLeft == false){
                    return false;
                    }
                    if (dashLeft == false){
                    return false;
                    } else{
                        return false;
                    }
                }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        return outsideLeft;
        }
        
    public boolean rightDoorStatus (){
        if (masterUnlock == true){
            if (currentGear == GearState.PARK) {
                if (childLock == false){
                    if (dashRight == true){
                        return true;
                    }
                    if (insideRight == true){
                        return true;
                    }
                    if (outsideRight == true){
                        return true;
                    }
                } else {
                    if (insideRight == false){
                    return false;
                    }
                    if (outsideRight == false){
                    return false;
                    }
                    if (dashRight == false){
                    return false;
                    } else{
                        return false;
                    }
                }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        return outsideRight;
    }














public static void main (String[] args) throws Exception{
    DoorSystem doorSystem = new DoorSystem();
    boolean openingFlag = false;
    
// Test 1
    doorSystem.updateState("10001110P");

    System.out.println("Phase 1:");
    if (doorSystem.leftDoorStatus() == true) {
        System.out.println("Left door is opening.");
        openingFlag = true;
    }
    
    if(doorSystem.rightDoorStatus() == true){
        System.out.println("Right door is opening.");
        openingFlag = true; 
    }

    if (openingFlag == false){
        System.out.println("Both doors stay closed.");
    }

// Test 2

    doorSystem.updateState("11001101P");
    openingFlag=false;
    System.out.println("Phase 2:");
    if (doorSystem.leftDoorStatus() == true) {
        System.out.println("Left door is opening.");
        openingFlag = true;
    }
    
    if(doorSystem.rightDoorStatus() == true){
        System.out.println("Right door is opening.");
        openingFlag = true;
    }
    if (openingFlag == false){
        System.out.println("Both doors stay closed.");
    }

// Test 3    
    doorSystem.updateState("11111111P");

    openingFlag = false;
    System.out.println("Phase 3:");
    if (doorSystem.leftDoorStatus() == true) {
        System.out.println("Left door is opening.");
        openingFlag=true;
    }
    
    if(doorSystem.rightDoorStatus() == true){
        System.out.println("Right door is opening.");
        openingFlag = true;
    }
    if (openingFlag == false){
        System.out.println("Both doors stay closed.");
    }


// Test 4

    doorSystem.updateState("001111103");

    openingFlag = false;
    System.out.println("Phase 4:");
    if (doorSystem.leftDoorStatus() == true) {
        System.out.println("Left door is opening.");
        openingFlag=true;
    }
    
    if(doorSystem.rightDoorStatus() == true){
        System.out.println("Right door is opening.");
        openingFlag=true;
    }
    if (openingFlag == false){
        System.out.println("Both doors stay closed.");
    }

    // Test 5

doorSystem.updateState("00000000P");

    openingFlag=false;
    System.out.println("Phase 5:");
    if (doorSystem.leftDoorStatus() == true) {
        System.out.println("Left door is opening.");
        openingFlag=true;
    }
    
    if(doorSystem.rightDoorStatus() == true){
        System.out.println("Right door is opening.");
        openingFlag = true;
    }
    if (openingFlag == false){
        System.out.println("Both doors stay closed.");
    }

}
}
