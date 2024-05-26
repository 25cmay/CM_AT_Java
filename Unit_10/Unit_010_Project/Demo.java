/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
import java.awt.EventQueue;

import animate.*;

public class Demo {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });
        
    }
}