import java.io.* ;

class DataStream1 {

public static void main(String... args) throws IOException
{
 String str = "hum hain lalu kha ke aalu" ;
 FileOutputStream fout = new FileOutputStream("lalu.txt");
 DataOutputStream dout = new DataOutputStream(fout);
 
 dout.writeInt(10) ;
 dout.writeLong(10L) ;
 dout.writeFloat(0.8f) ;
 dout.writeDouble(1.6) ;
 dout.writeBoolean(true) ;
 dout.close() ;

 FileInputStream fin = new FileInputStream("lalu.txt") ;
 DataInputStream din = new DataInputStream(fin) ;
 

 // data should be read in the same sequece as it was written into the file
 int i = din.readInt() ;
 long l = din.readLong() ;
 float f = din.readFloat() ;
 double d = din.readDouble() ;
 boolean b = din.readBoolean() ;
 
 System.out.print( i  + " ") ;
  System.out.print( l  + " ") ;
  System.out.print( f  + " ") ;
  System.out.print( d  + " ") ;
 System.out.print( b  + " ") ;  

 din.close() ;
}
}