package animate;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;

import javax.swing.JPanel;

import sound.SoundClip;

public class Board extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private int x = 0;
    private int y = 0;
    private int dx;
    private int dy;
    private final int DIAMETER = 20;
    private BufferedImage img;
    private double angle = 0;

    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;
    private int xSpeed = 2;
    private int ySpeed = 2;

    // constructor
    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // set the initial position of the ball
        // to be on the left side of the content area
        // and in the middle of the content area.
        x = B_WIDTH / 2; // Start in the middle of the screen
        y = B_HEIGHT / 2;
        Random rand = new Random();
        dx = rand.nextInt(5) + 1; // Random horizontal velocity from 1 to 5
        dy = rand.nextInt(5) + 1; // Random vertical velocity from 1 to 5
            
        // Load media clips
        sitarClip = new SoundClip("media/sitar_music.wav");
        sitarClip.setLoop(true); // Loop continuously
        owClip = new SoundClip("media/ow_sound.wav");
        // photo
        try {
            File imgFile = new File("media/Andy.png");
            img = ImageIO.read(imgFile);
        } catch (Exception e) {
            System.err.println("unable to open image file!");
            System.err.println(e.getMessage());
        }

        // sitar
        try {
            SoundClip sitarClip = new SoundClip("media/sitar.wav");
            
        } catch (Exception e) {
            System.err.println("unable to open audio file!");
            System.err.println(e.getMessage());
        }

        timer = new Timer();
        timer.scheduleAtFixedRate(new UpdateAnimation(),
                INITIAL_DELAY, PERIOD_INTERVAL);
        sitarClip.open();
        sitarClip.play();
                }

    // override paint component
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x - DIAMETER / 2, y - DIAMETER / 2);
        affineTransform.rotate(Math.toRadians(angle), img.getWidth() / 2, img.getHeight() / 2);
        g2d.drawImage(img, affineTransform, null);
    }

    private class UpdateAnimation extends TimerTask {
        /*
         * Override the run() method.
         * Update the position of our ball here.
         */
        public void run() {

            x += xSpeed;
            if (x > B_WIDTH) {
                x = 0;
            }
            y += ySpeed;
            if (y > B_WIDTH) {
                y = 0;
            }

            angle += 5;
            angle = angle % 360;
            repaint();

        }
    }

}
