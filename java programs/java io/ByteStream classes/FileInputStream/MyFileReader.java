import java.io.* ;

class MyFileReader
{
  public static void main(String... args) throws IOException
  {
    FileInputStream fin = new FileInputStream("e:\\f2\\lalu2.txt") ;
    int i = 0 ;
    
    while( (i = fin.read() ) != -1)   // read returns -1 when ther is no more data to read in file
     {
      System.out.print( (char)i ) ;   
      }
     
    fin.close() ;
   }
}