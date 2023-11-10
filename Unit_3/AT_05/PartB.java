/* Caleb May
* AT JAVA
* Mr. Eng
 */

import java.util.Scanner;

class Television {
    // Define needed variables 
    int channel = 1;
    int volume = 10;
    final int MIN_CHANNEL = 1;
    final int MAX_CHANNEL = 10;
    final int MIN_VOLUME = 0;
    final int MAX_VOLUME = 20;
    boolean power = true;

    // Create Methods
    public void changeChannel(int channel) {
        if (channel > MAX_CHANNEL && channel < MIN_CHANNEL) {
            System.out.print("That is an invalid channel!");
        } else {

        }
    }
    public void increaseVolume(int increment) {
        volume = volume + increment;
    }
    public void decreaseVolume(int decrement) {
        volume = volume + decrement;
    }
    public void tvPower(boolean newStatus) {
        power = newStatus;
    }
     
    // Print states
    public void getStates(){
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
        if (power = true) {
            System.out.println("Status: ON");
        } else if (power = false) {
            System.out.println("Status: OFF");
        }
    }
}


public class PartB {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        Television tv = new Television();
        int newChannel = 1;
        for(int i = 0; i < 3; i++) {
            System.out.println("Pick a channel (1-10): ");
            newChannel = in.nextInt();
            tv.changeChannel(newChannel);

            tv.increaseVolume(i);

        }
    }
}
