

/* This applet displays a message moving horizontally
   across the screen. */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HWBanner15 extends JApplet
  implements ActionListener
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int xPos, yPos;  // hold the coordinates of the banner

  public void init()
  {
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    xPos = c.getWidth();
    yPos = c.getHeight() / 2;
    Timer clock = new Timer(30, this);  // fires every 30 milliseconds
    clock.start();
  }

  // Called automatically after a repaint request
  public void paint(Graphics g)
  {
    super.paint(g);
    g.fillRect(xPos, yPos, 150, 45); //you did not need both fillRect and drawRect, but you did need the color, to set it to black.
    g.drawRect(xPos, yPos, 150, 45);
  }

  // Called automatically when the timer fires
  public void actionPerformed(ActionEvent e)
  {
    Container c = getContentPane();

    // Adjust the horizontal position of the banner:
    xPos--;
    if (xPos < -100)
    {
      xPos = c.getWidth();
    }

    // Set the vertical position of the banner:
    yPos = c.getHeight() / 2;

    repaint();
  }
}
