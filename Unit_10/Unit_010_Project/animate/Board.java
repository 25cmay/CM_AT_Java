package animate;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener{
   private static final int B_WIDTH = 1392;
   private static final int B_HEIGHT = 783;
   private static final int FLOOR = B_HEIGHT - 25;
   private static final int SIDE_LEN = 150;
   private Cannon cannon;
   //private BufferedImage cannonimage;
 

    // constructor
   public Board() {
      setBackground(Color.CYAN);
      setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
      
      cannon = new Cannon();
      cannon.setX(60);
      cannon.setY(B_HEIGHT - 60);

      this.setFocusable(true);
      this.addKeyListener(this);

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

      cannon.draw(g2d);
    }

   @Override
   public void keyTyped(KeyEvent e) {
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
   }

   @Override
   public void keyPressed(KeyEvent e) {
      // System.out.println("A key was presed!");

      if(e.getKeyCode() == KeyEvent.VK_SPACE) {
         // snd.play();
         System.out.println("SPACE Key was pressed");
         cannon.fire();
      }
      if(e.getKeyCode() == KeyEvent.VK_LEFT) {
         System.out.println("LEFT Key was pressed");
         cannon.rotateCounterClockwise();
         repaint();
      }
      if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
         System.out.println("RIGHT Key was pressed");
         cannon.rotateClockwise();
         repaint();
      }
      if(e.getKeyCode() == KeyEvent.VK_UP) {
         System.out.println("UP Key was pressed");
      }
      if(e.getKeyCode() == KeyEvent.VK_DOWN) {
         System.out.println("DOWN Key was pressed");
      }
      //snd.play();
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
   }

   @Override
   public void keyReleased(KeyEvent e) {
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
   }

    
}