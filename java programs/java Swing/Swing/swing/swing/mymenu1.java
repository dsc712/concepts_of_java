import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class mymenu1 extends MouseAdapter
{

	JFrame f=new JFrame();
	JPopupMenu p=new JPopupMenu("Pop");
	JMenuItem i1=new JMenuItem("New");
	JMenuItem i2=new JMenuItem("Open");
	JMenuItem i3=new JMenuItem("Save");
	JMenuItem i4=new JMenuItem("Exit");

	mymenu1()
	{
		p.add(i1);
		p.add(i2);
		p.add(i3);
		p.add(i4);
		f.addMouseListener(this);
		f.setSize(400,400);
		f.setVisible(true);
		}
	public void mouseClicked(MouseEvent e)
	{	
	
	int x=e.getButton();

if(x==MouseEvent.BUTTON3)
	p.show(e.getComponent(),e.getX(),e.getY());
		
	
	}
	public static void main(String s[])
	{
		new mymenu1();
		
	}
}	
	