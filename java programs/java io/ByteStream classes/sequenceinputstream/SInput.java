import java.io.* ;
import java.util.* ;
 
class SInput 
{
 public static void main(String... args) throws IOException 
 {
   /*without enumeration we can read from only two files , a/c to formal argument
   in case if we are required to read from more than two files then always prefer
    Enumeration interface present in util package */

  // SequenceInputStream sin = new SequenceInputStream(new FileInputStream("myfile.txt") , new FileInputStream("rabri.txt")  ) ;
   
  SequenceInputStream sin = new SequenceInputStream(new MyEnum() ) ;
 
   String s = " " ;
   
   DataInputStream din = new DataInputStream(sin) ;

   while( s != null )
   {
     s =  din.readLine() ;

     if( s != null )
      System.out.println(s) ;
 
   }
  
  din.close() ;
  sin.close() ;
  }
}
 
class MyEnum implements Enumeration
{
 InputStream in[] ;
 int i = -1 ;
 
 MyEnum()
 {
   try{
    in = new InputStream[]{new FileInputStream("myfile.txt") , new FileInputStream("lalu.txt") , new FileInputStream("rabri.txt") } ;
    }
   catch(Exception e){ }
 }
 
  public boolean hasMoreElements()    //callback method
 {
   System.out.println(" has more elements ") ;
   
   if( ++i < in.length )
     return true ;
   else 
     return false ;
     
 }
 
 public Object nextElement(){    // callback method   
  System.out.println("next element" + i) ;
  return in[i] ;
 }
}