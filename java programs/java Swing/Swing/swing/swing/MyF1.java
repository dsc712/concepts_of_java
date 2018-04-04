import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyCanvas1 extends  Canvas
{
public void paint(Graphics g)
{
g.setColor(Color.RED);
g.drawLine(70,70,200,200);
}
} 
class MyF1 
{

	
	MyF1()
	{
		Frame f=new Frame("graphics");
			
MyCanvas1 c=new MyCanvas1();
		f.add(c);
		f.setSize(400,400);
		//f.setLayout(null);
		f.setVisible(true);
		
}
public static void main(String s[])
{
new MyF1();
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