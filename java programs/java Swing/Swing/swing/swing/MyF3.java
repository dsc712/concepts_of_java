import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyF3  implements ActionListener
{
Button b;
	
	MyF3()
	{
		Frame f=new Frame("graphics");
		b=new Button();
		b.setBounds(50,50,300,300);
		b.addActionListener(this);

		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
}
public void actionPerformed(ActionEvent e)
{
Graphics g=b.getGraphics();
g.drawLine(70,70,200,200);
g.drawOval(70,70,200,200);
}
public static void main(String s[])
{
new MyF3();
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