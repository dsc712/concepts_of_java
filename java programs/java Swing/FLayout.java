import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FLayout 
{
JFrame f;
JButton b[];
FLayout(String s)
{
 f=new JFrame(s);
b=new JButton[5];
String s1[]={"north","south","east","west","center"};

for(int i=0;i<b.length;i++)
{
b[i]=new JButton(s1[i]);
f.add(b[i]);
}
f.setLayout(new FlowLayout(FlowLayout.LEFT,30,30)); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
f.setVisible(true);
}

public static void main(String s[])
{

new FLayout("FlowLayout");

}
}


//Container c=f.getContentPane();
//c.add(jt);
//c.add(b);
//c.add(b1);
//jp=new JPanel();
//cl=new CardLayout();
//jp.setLayout(cl);


