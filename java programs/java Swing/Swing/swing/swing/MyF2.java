import java.awt.*;
import java.awt.event.*;

class MyCanvas1 extends Canvas
{
int flag=0;
public void paint(Graphics g)
{
if(flag==1)
{
g.setColor(Color.RED);
g.drawLine(70,70,200,200);
}
}

} 
class MyF2 implements ActionListener
{
MyCanvas1 m=new MyCanvas1();

	
	MyF2()
	{
		Frame f=new Frame("graphics");
			Button b=new Button("line");
		
		f.add(m);
		f.add(b);
		b.addActionListener(this);
		f.setSize(400,400);
		f.setLayout(new GridLayout(2,1));
		f.setVisible(true);
		
}
public void actionPerformed(ActionEvent e)
{
m.flag=1;
m.repaint();
}
public static void main(String s[])
{
new MyF2();
}
}





//MyCanvas1 m=new MyCanvas1();


//Graphics g=b.getGraphics();

		//g.drawLine(70,70,200,200);
//g.setColor(Color.RED);
//Button b=new Button();
//TextField b=new TextField();
		//b.setBounds(50,50,300,300);
//b.setBackground(Color.GREEN);	
//f.setBackground(Color.GREEN);
		//f.setLayout(null);