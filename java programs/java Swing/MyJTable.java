import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJTable extends JFrame {

  String[] headings    = {"name"  ,"add","salary"};
String items[][]={
		{"amit","delhi","1000"},
		{"amit","delhi","1000"},
		{"amit","delhi","1000"},
		{"amit","delhi","1000"},
		{"amit","delhi","1000"},
		{"amit","delhi","1000"},
	};
  public MyJTable() {
    super("Table example");  
JTable jt=new JTable(items,headings);
JScrollPane jp=new  JScrollPane(jt);
    add(jp);
setSize(400,400);
//pack();
setVisible(true);
  }
  public static void main (String args[]) 
{
 new MyJTable();
      }
    }
    



