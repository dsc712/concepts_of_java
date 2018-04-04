import java.io.* ;
class MyFileWriter
{
 public static void main(String... args) throws IOException
 {
  //FileOutputStream fout = new FileOutputStream("lalu.txt") ;  // write mode
  
  //FileOutputStream fout = new FileOutputStream("lalu.txt",true) ; // appends
  
 // FileOutputStream fout = new FileOutputStream(new File("e:\\f2\\lalu2.txt") ) ;// write mode at specified location
 
   FileOutputStream fout = new FileOutputStream(new File("e:\\f2\\lalu2.txt"),true ) ; // append mode at specified location
  String s = "devyendu shekhar choudhary is the best java programmer" ;
  
  byte ch[] = s.getBytes() ;
  
  fout.write(ch) ;  //write()method is overloaded (it can take a byte or even a byte array)

  // for (int i=0 ; i<ch.length ; i++ ) {
  // 	 fw.write(ch[i]) ;
  // }
  
  fout.close() ;
  System.out.println("  file created successfully  .... " ) ;
  }
}