/* Caleb May
* AT JAVA
* Mr. Eng
 */
import java.util.Scanner;
interface Television {
    public void changeChannel(int newValue);

    public void increaseVolume(int increment);
    public void decreaseVolume(int decrement);

    public void tvPower(boolean newStatus);
}


class ColorTelevision implements Television {
    // Define needed variables 
    int channel = 1;
    int volume = 10;
    boolean power = false;

    // Create Methods
    public void changeChannel(int newValue) {
        channel = newValue;
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
    public void printstates(){
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
        if (power = true) {
            System.out.println("Status: ON");
        } else if (power = false) {
            System.out.println("Status: OFF");
        }
    }
}


public class PartC {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        Television tv = new ColorTelevision();

        System.out.print
    }
}
