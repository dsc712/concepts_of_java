import java.io.* ;

class BStream {

public static void main(String... args){
 String srcFile = "lalu.txt" ;

 try(FileInputStream fin = new FileInputStream(srcFile) ;
      BufferedInputStream bis = new BufferedInputStream(fin)  )
 {
  //read one byte at a time and display it
   
   byte byteData ;
   
   while( ( byteData = (byte)bis.read() ) != -1 )
   {
    System.out.print( (char)byteData ) ;
    }
  }
  catch(Exception e)
   {
     e.printStackTrace() ;  
    }
 
}
}