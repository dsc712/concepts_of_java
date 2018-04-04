import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mytoolbar implements ActionListener
{

   TextField t=new TextField();
JToolBar jt=new JToolBar("my");
JFrame jf=new JFrame("myframe");
JButton jb=new JButton();

JButton jb1=new JButton("ok1");
Mytoolbar()
{
 Container c=jf.getContentPane();
jb.setBackground(Color.RED);
 jb.addActionListener(this);
 jt.add(jb);
 jt.add(jb1);
  c.add(t);
 c.add(jt);
c.setLayout(new FlowLayout(FlowLayout.LEFT));
  jf.setSize(300,300);
 jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
t.setText("hello");
}
public static void main(String s[])
{
new Mytoolbar();
}
}
