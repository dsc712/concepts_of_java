import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
public class JInternalFrames extends JFrame {
  public static void main(String[] args) {
    new JInternalFrames();
  }

  public JInternalFrames() {
    super("Multiple Document Interface");
    WindowUtilities.setNativeLookAndFeel();
    addWindowListener(new ExitListener());
    Container content = getContentPane();
    content.setBackground(Color.white);
    JDesktopPane desktop = new JDesktopPane();
    desktop.setBackground(Color.white);
    content.add(desktop, BorderLayout.CENTER);
    setSize(450, 400);
    for(int i=0; i<5; i++) {
      JInternalFrame frame
        = new JInternalFrame(("Internal Frame " + i),
                             true, true, true, true);
      frame.setLocation(i*50+10, i*50+10);
      frame.setSize(200, 150);
      frame.setBackground(Color.red);
	frame.setVisible(true);
      desktop.add(frame);
      frame.moveToFront();
    }
    setVisible(true);
  }
}
