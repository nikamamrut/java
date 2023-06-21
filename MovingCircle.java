//q15
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingCircle extends JFrame implements MouseMotionListener {

  int x, y;

  MovingCircle() {
    // add mouse motion listener to the frame
    addMouseMotionListener(this);

    // set the size of the frame
    setSize(400, 400);

    // set the title of the frame
    setTitle("Moving Circle");

    // set the default close operation of the frame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // set the visibility of the frame
    setVisible(true);
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.RED);
    g.fillOval(x, y, 50, 50);
  }

  public void mouseDragged(MouseEvent e) {
  }

  public void mouseMoved(MouseEvent e) {
    // get the x and y position of the mouse
    x = e.getX();
    y = e.getY();

    // repaint the frame
    repaint();
  }

  public static void main(String[] args) {
    // create the frame
    MovingCircle mc = new MovingCircle();
  }
}
