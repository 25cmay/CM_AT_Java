/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

import animate.Application; 
import sound.SoundClip;

public class PartB {
    public static void main(String[] args) {
        SoundClip boing = new SoundClip("media/boing.wav");
        boing.open();
        boing.setLoop(true);
        boing.play(true);

        Application myApp = new Application("Demo App");
        myApp.setVisible(true);

       
    }
}