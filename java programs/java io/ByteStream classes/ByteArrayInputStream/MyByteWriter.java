/* ByteArrayOutputStream is used to write same data to multiple streams .*/

import java.io.* ;

class MyByteWriter 
{
 public static void main(String... args) throws IOException
 {
  ByteArrayOutputStream bout = new ByteArrayOutputStream() ; //by default 32 bytes
  

  String s = " good day :>" ;
  String s1 = " ha ha write overwrites" ;
  byte ch[] = s.getBytes();
 

  bout.write(ch) ; // write() method writes data to the specified byte array output stream
 //writeTo() is used for writing the content of byte array output stream to the specified output stream

  bout.writeTo(new FileOutputStream("lalu.txt") ) ;    
  bout.writeTo(new FileOutputStream("rabri.txt") ) ;
  
  System.out.print( bout.toString() );

  bout.close();
 }
}