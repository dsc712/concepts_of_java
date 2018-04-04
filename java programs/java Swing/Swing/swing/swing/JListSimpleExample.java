import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
            

public class JListSimpleExample extends JFrame {
  public static void main(String[] args) {
    new JListSimpleExample();
  }

  private JList sampleJList;
  private JTextField valueField;
  
  public JListSimpleExample() {
    super("Creating a Simple JList");
    WindowUtilities.setNativeLookAndFeel();
    addWindowListener(new ExitListener());
    Container content = getContentPane();

    // Create the JList, set the number of visible rows, add a
    // listener, and put it in a JScrollPane.
    String[] entries = { "Entry 1", "Entry 2", "Entry 3",
                         "Entry 4", "Entry 5", "Entry 6" };
    sampleJList = new JList(entries);
    sampleJList.setVisibleRowCount(4);
    Font displayFont = new Font("Serif", Font.BOLD, 18);
    sampleJList.setFont(displayFont);
    sampleJList.addListSelectionListener(new ValueReporter());
    JScrollPane listPane = new JScrollPane(sampleJList);
    
    JPanel listPanel = new JPanel();
    listPanel.setBackground(Color.white);
    Border listPanelBorder =
      BorderFactory.createTitledBorder("Sample JList");
    listPanel.setBorder(listPanelBorder);
    listPanel.add(listPane);
    content.add(listPanel, BorderLayout.CENTER);
    JLabel valueLabel = new JLabel("Last Selection:");
    valueLabel.setFont(displayFont);
    valueField = new JTextField("None", 7);
    valueField.setFont(displayFont);
    JPanel valuePanel = new JPanel();
    valuePanel.setBackground(Color.white);
    Border valuePanelBorder =
      BorderFactory.createTitledBorder("JList Selection");
    valuePanel.setBorder(valuePanelBorder);
    valuePanel.add(valueLabel);
    valuePanel.add(valueField);
    content.add(valuePanel, BorderLayout.SOUTH);
    pack();
    setVisible(true);
  }

  private class ValueReporter implements ListSelectionListener {
   
    public void valueChanged(ListSelectionEvent event) {
          valueField.setText(sampleJList.getSelectedValue().toString());
    }
  }
}
    


