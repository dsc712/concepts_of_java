import java.awt.*;
import javax.swing.*;
public class JButtons extends JFrame {
  public static void main(String[] args) {
    new JButtons();
  }

  public JButtons() {
    super("Using JButton");
   WindowUtilities.setMotifLookAndFeel() ;
    addWindowListener(new ExitListener());
    Container content = getContentPane();
    content.setBackground(Color.RED);
    content.setLayout(new FlowLayout());
    JButton button1 = new JButton("Java");
    content.add(button1);
  
    JButton button2 = new JButton("second");
    content.add(button2);
    JButton button3 = new JButton("Third");
    content.add(button3);
    JButton button4 = new JButton("forth");

    content.add(button4);
    pack();
    setVisible(true);
  }
}
