import java.io.* ;

public class MyClient1
{
 ObjectOutputStream dout ;
 
 public MyClient1()
 {
    try{
     Emp e1 = new Emp("ducat noida" , 10 , 5 , 20 , 100) ;
     dout = new ObjectOutputStream(new FileOutputStream("ducat.txt") ) ;
     dout.writeObject(e1) ;
     dout.flush() ;
    }
    catch(Exception e)
     {
       System.out.println(e) ; 
     }
  }
 
 public static void main(String... args)  
 {
   new MyClient1() ;
 }
}