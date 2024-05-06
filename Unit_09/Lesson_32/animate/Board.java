package animate;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener {
    // Size of board
    private static final int B_WIDTH = 350;
    private static final int B_HEIGHT = 350;

    private SoundClip sndBlop;

    // constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        sndBlop = new SoundClip("media/Blop.wav");
        sndBlop.open();


        this.setFocusable(true);
        this.addKeyListener(this);
        
    }

    // override paint component
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.MAGENTA);

    }

    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("a key was pressed");

        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            sndBlop.play();
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    
}
