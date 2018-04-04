import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mymenu implements ActionListener
{
JTextField tf=new JTextField();
JFrame jf=new JFrame("Mymenu");
JMenuBar menuBar;
JMenu menu, submenu;
JMenuItem menuItem,exit;
JRadioButtonMenuItem rbMenuItem;
JCheckBoxMenuItem cbMenuItem;
Mymenu()
{
	jf.add(tf);
	menuBar = new JMenuBar();
	menu = new JMenu("First Menu");
	menu.setMnemonic(KeyEvent.VK_F);
	menuBar.add(menu);
	menuItem = new JMenuItem("A text-only menu item",KeyEvent.VK_T);
menuItem.addActionListener(this);

Icon  i1=new ImageIcon("images/new.gif");
menuItem.setIcon(i1);
//jf.setIcon(i1);
KeyStroke  i=KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK);
menuItem.setAccelerator(i);
	menu.add(menuItem);
	//a group of radio button menu items
	menu.addSeparator();
	ButtonGroup group = new ButtonGroup();
	rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
	rbMenuItem.setSelected(true);
	rbMenuItem.setMnemonic(KeyEvent.VK_R);
rbMenuItem.setIcon(new ImageIcon("images/dining.gif"));
	group.add(rbMenuItem);
	menu.add(rbMenuItem);
	rbMenuItem = new JRadioButtonMenuItem("Another one");
	rbMenuItem.setMnemonic(KeyEvent.VK_O);
	group.add(rbMenuItem);
rbMenuItem.setIcon(new ImageIcon("images/import.gif"));
	menu.add(rbMenuItem);
	//a group of check box menu items
	menu.addSeparator();
	cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
	cbMenuItem.setMnemonic(KeyEvent.VK_C);
cbMenuItem.setIcon(new ImageIcon("images/find.gif"));
	menu.add(cbMenuItem);
	cbMenuItem = new JCheckBoxMenuItem("Another one");
	cbMenuItem.setMnemonic(KeyEvent.VK_H);
cbMenuItem.setIcon(new ImageIcon("images/cut.gif"));
	menu.add(cbMenuItem);
	//a submenu
	menu.addSeparator();
	submenu = new JMenu("A submenu");
	submenu.setMnemonic(KeyEvent.VK_S);
	menuItem = new JMenuItem("An item in the submenu");
	menuItem.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_2, ActionEvent.ALT_MASK));
	submenu.add(menuItem);
	menuItem = new JMenuItem("Another item");
	submenu.add(menuItem);
	menu.add(submenu);
	exit=new JMenuItem("exit");
exit.addActionListener(this);
exit.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_3, ActionEvent.SHIFT_MASK));
exit.setIcon(new ImageIcon("images/stop.gif"));
exit.setMnemonic(KeyEvent.VK_X);
	menu.add(exit);
	//Build second menu in the menu bar.
	menu = new JMenu("Another Menu");
	menu.setMnemonic(KeyEvent.VK_N);
	menuBar.add(menu);
	jf.setJMenuBar(menuBar);
	jf.setSize(300,400);
	jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand().equals("exit"))
System.exit(0);

if(e.getActionCommand().equals("A text-only menu item"))
{
tf.setText("hello");
}
}
public static void main(String s[])
{
new Mymenu();
}

}







