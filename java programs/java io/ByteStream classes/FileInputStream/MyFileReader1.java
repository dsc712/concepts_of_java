import java.io.* ;

class MyFileReader1
{
  public static void main(String... args) throws IOException
  {
   FileInputStream fin =  new FileInputStream("lalu2.txt") ;
   byte b[] = new byte[ fin.available() ];   // available() method can calculate the no. of bytes in file in advance
   fin.read(b) ;  // read( byte[] ) - overloade read() method
   String s = new String(b) ;
   System.out.print(s) ; 
   }
}