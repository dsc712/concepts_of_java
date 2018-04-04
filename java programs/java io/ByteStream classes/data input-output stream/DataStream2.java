import java.io.* ;

class DataStream2 {

public static void main(String... args) throws IOException
{
  DataInputStream din = new DataInputStream(System.in) ;
  FileOutputStream fout = new FileOutputStream("ducat.txt") ;
  DataOutputStream dout = new DataOutputStream(fout) ;
  
  String s = " " ;
  
  while( !s.equals("stop") )
  { 
    s = din.readLine() ;
    System.out.println(s) ; 
    dout.writeUTF(s) ;
    dout.flush() ;
  }

  din.close() ;
  dout.close() ;
}

}