import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    


public class JColorChooserTest extends JFrame
                               implements ActionListener {
  public static void main(String[] args) {
    new JColorChooserTest();
  }

  public JColorChooserTest() {
    super("Using JColorChooser");
    WindowUtilities.setNativeLookAndFeel();
    addWindowListener(new ExitListener());
    Container content = getContentPane();
    content.setBackground(Color.white);
    content.setLayout(new FlowLayout());
    JButton colorButton
      = new JButton("Choose Background Color");
    colorButton.addActionListener(this);
    content.add(colorButton);
    setSize(300, 100);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    // Args are parent component, title, initial color
    Color bgColor
      = JColorChooser.showDialog(this,
                                 "Choose Background Color",
                                Color.RED);
    if (bgColor != null)
      getContentPane().setBackground(bgColor);
  }
}
