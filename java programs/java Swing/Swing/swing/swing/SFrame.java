import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SFrame implements ActionListener
{
JFrame f;
JButton b;
Button b1;
JTextField jt;
Icon i;
SFrame(String s)
{	
//i=new ImageIcon("puccy.gif");
 f=new JFrame("swing");
jt=new JTextField();
jt.setBounds(150,40,100,100);
 b=new JButton("swing");
b1=new Button("awt");
b.setBounds(40,40,100,100);
b1.setBounds(40,150,50,50);
Container c=f.getContentPane();
c.add(jt);
c.add(b);
c.add(b1);
//f.add(b);
b.addActionListener(this);
//f.add(b1);
//f.add(jt);
c.setLayout(null);//WindowConstants
f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
f.setSize(400,400);
f.setVisible(true);
}
public  void actionPerformed(ActionEvent e)
{
//b.setIcon(i);
jt.setText("swing example ");

}

public static void main(String s[])
{
new SFrame("second frame");

new SFrame("second frame");
}
}







//Container c=f.getContentPane();
//c.add(jt);
//c.add(b);
//c.add(b1);



