import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class MyTree 
{
JFrame jf;
JTree jt;
JScrollPane jp;

MyTree()
{
jf=new JFrame("tree demo");
DefaultMutableTreeNode root=new DefaultMutableTreeNode("style");

DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
root.add(color);
root.add(font);
DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
color.add(red);
color.add(green);
color.add(blue);
DefaultMutableTreeNode bold=new DefaultMutableTreeNode("bold");
DefaultMutableTreeNode italic=new DefaultMutableTreeNode("italic");
DefaultMutableTreeNode un=new DefaultMutableTreeNode("un");
font.add(bold);
font.add(italic);
font.add(un);
jt=new JTree(root);

jp=new JScrollPane(jt);
jf.add(jp);
jf.setSize(400,400);
jf.setVisible(true);
}
public static void main(String d[])
{
new MyTree();
}
}





