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
menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
	menu.add(menuItem);
	//a group of radio button menu items
	menu.addSeparator();
	ButtonGroup group = new ButtonGroup();
	rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
	rbMenuItem.setSelected(true);
	rbMenuItem.setMnemonic(KeyEvent.VK_R);
	group.add(rbMenuItem);
	menu.add(rbMenuItem);
	rbMenuItem = new JRadioButtonMenuItem("Another one");
	rbMenuItem.setMnemonic(KeyEvent.VK_O);
	group.add(rbMenuItem);
	menu.add(rbMenuItem);
	//a group of check box menu items
	menu.addSeparator();
	cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
	cbMenuItem.setMnemonic(KeyEvent.VK_C);
	menu.add(cbMenuItem);
	cbMenuItem = new JCheckBoxMenuItem("Another one");
	cbMenuItem.setMnemonic(KeyEvent.VK_H);
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







