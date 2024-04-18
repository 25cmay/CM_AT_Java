/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

import javax.sound.sampled.LineUnavailableException;
import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class PartA {
    public static void main(String[] args) throws LineUnavailableException {
        ToneGenerator tg = new ToneGenerator();
        tg.init();
        // old mcdonald
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 500);
        // had a farm
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 500);
        tg.play(Note.REST, 50);
        // e i e i o
        tg.play(Note.E4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 250);
        tg.play(Note.REST, 50);
        // with a chick, chick here
        tg.play(Note.G4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        // and a chick chick there
        tg.play(Note.C4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        // here a chick, there a chick
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        // everywhere a chick, chick
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        // old mcdonald 
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 500);
        tg.play(Note.REST, 50);
        // had a farm
        tg.play(Note.A4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 500);
        tg.play(Note.REST, 50);
        // e i e i o
        tg.play(Note.E4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 250);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 250);
        tg.play(Note.REST, 50);

        tg.close();
    }
}
