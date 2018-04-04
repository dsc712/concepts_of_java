import java.io.* ;

class DataRead 
{
 public static void main(String... args) throws IOException
 {
   DataOutputStream dout = new DataOutputStream( new FileOutputStream("Ducat4.txt") ) ;
   String s = "\n india is the best \n I am an Indian \n and Iam proud to be an indian ..\n ha ha " ;
   dout.writeBytes(s) ;
  
   DataInputStream din = new DataInputStream(new FileInputStream("ducat4.txt")) ;
   
   String s1 = " " ;

   while( s1!= null) 
   {
     s1 = din.readLine() ;
     
     if(s1 != null)
      System.out.println(s1) ;
   }
   
   dout.close() ;
   din.close() ;
 }
}