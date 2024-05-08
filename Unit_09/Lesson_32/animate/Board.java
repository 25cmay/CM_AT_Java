package animate;

import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener, MouseListener{
   private static final int B_WIDTH = 200;
   private static final int B_HEIGHT = 200;
   private static final int C_DIAMETER = 20;
   private int x;
   private int y;
   private SoundClip sndBlop;
   private SoundClip sndBlip;

    // constructor
   public Board() {
      setBackground(Color.CYAN);
      setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));  
      
      //x = (B_WIDTH - C_DIAMETER) / 2;
      //y = (B_HEIGHT - C_DIAMETER) / 2;
      x = B_WIDTH / 2;
      y = B_HEIGHT / 2;

      sndBlop = new SoundClip("media/blop.wav");
      sndBlop.open(); 

      sndBlip = new SoundClip("media/blip.wav");
      sndBlip.open(); 

      this.setFocusable(true);
      this.addKeyListener(this);
      this.addMouseListener(this);

    }

    // override paint component
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      Graphics2D g2d = (Graphics2D) g;
      g2d.setColor(Color.MAGENTA);

      g2d.fillOval(x - C_DIAMETER / 2, y - C_DIAMETER, C_DIAMETER, C_DIAMETER);
    }

   @Override
   public void keyTyped(KeyEvent e) {
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
   }

   @Override
   public void keyPressed(KeyEvent e) {
      
      if(e.getKeyCode() == KeyEvent.VK_SPACE) {
         x = B_WIDTH / 2;
         y = B_HEIGHT / 2;
         repaint();
         sndBlop.play();
         System.out.println("SPACE key was pressed!");
      }
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
   }

   @Override
   public void keyReleased(KeyEvent e) {
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
   }

   @Override
   public void mousePressed(MouseEvent e) {
      x = e.getX();
		y = e.getY();
      sndBlip.play();
      repaint();
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
   }

   @Override
   public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub
      // throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
   }

    
}