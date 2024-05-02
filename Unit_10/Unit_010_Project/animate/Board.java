package animate;

import java.awt.*;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Board extends JPanel {
    // Size of board
    private static final int B_WIDTH = 1600;
    private static final int B_HEIGHT = 900;
    private static final int FLOOR = B_HEIGHT - 25;
    private static final int SIDE_LEN = 150;

    // constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));   

    }

    // override paint component
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.MAGENTA);

        g.setColor(Color.BLACK);
        g.drawLine(0, FLOOR, B_WIDTH, FLOOR);
        g.setColor(Color.GREEN);
        g.fillRect(0, FLOOR + 1, B_WIDTH, B_HEIGHT - FLOOR);


    }

    
}
