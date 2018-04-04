import java.awt.*;
import javax.swing.*;

public class JLabels extends JFrame {
  public static void main(String[] args) {
    new JLabels();
  }

  public JLabels() {
    super("Using HTML in JLabels");
    WindowUtilities.setNativeLookAndFeel();
    addWindowListener(new ExitListener());
    Container content = getContentPane();
    Font font = new Font("Serif", Font.PLAIN, 30);
    content.setFont(font);
    String labelText =
      "<html><FONT COLOR=RED>Red</FONT> and " +
      "<FONT COLOR=BLUE>Blue</FONT> Text</html>";
    JLabel coloredLabel =
      new JLabel(labelText, JLabel.CENTER);
    coloredLabel.setBorder
      (BorderFactory.createTitledBorder("Mixed Colors"));
    content.add(coloredLabel, BorderLayout.NORTH);
    labelText =
      "<html><B>Bold</B> and <I>Italic</I> Text</html>";
    JLabel boldLabel =
      new JLabel(labelText, JLabel.CENTER);
    boldLabel.setBorder
      (BorderFactory.createTitledBorder("Mixed Fonts"));
    content.add(boldLabel, BorderLayout.CENTER);
    labelText =
      "<html>India is a good country" +
      "in the world" +
      "<P>" +
      "Major cities of india" +
      "<UL>" +
      "  <LI>delhi" +
      "  <LI>noida" +
      "  <LI>mumbai" +
      "  <LI>meerut" +
      "  <LI>lucknow" +
      "  <LI>patna" +
      "  <LI>bralie" +
      "  <LI>etc" +
      "</UL>";
    JLabel fancyLabel =
      new JLabel(labelText,JLabel.CENTER);
    fancyLabel.setBorder
      (BorderFactory.createTitledBorder("Multi-line HTML"));
    content.add(fancyLabel, BorderLayout.SOUTH);
    pack();
    setVisible(true);
  }
}
    
    
