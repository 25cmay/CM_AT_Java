public class GearedBicycle extends Bicycle {
    // Set Max Gear
    private static final int MAX_GEAR = 6;
    // Create gear variable
    private int gear = 1; 
    // create geared max speed
    private final int MAX_SPEED_GEARED = 50; 

    // return the gear
    public int getGear() {
        return gear;
    }

    // set the gear
    public void setGear(int newGear) {
        gear = newGear;
    }

    // shift the gear up
    public void shiftUp() {
        gear = gear +1;
        if (gear > MAX_GEAR) {
            gear = MAX_GEAR;
        }
    }

    // shift the gear down
    public void shiftDown() {
        gear = gear - 1;
        if (gear < 1) {
            gear = 1;
        }
    }

    // override the pedal function
    public void pedal() {
        int newSpeed = getSpeed() + getGear();
        if (newSpeed > MAX_SPEED_GEARED) {
            newSpeed = MAX_SPEED_GEARED;
        }
        setSpeed(newSpeed);
    }

    // override with better breaks
    public void brake() {
        int newSpeed = getSpeed();
        newSpeed = newSpeed - 2;
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        setSpeed(newSpeed);
    }


    
}
