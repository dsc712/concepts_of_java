import java.io.* ;

class MyByteWriter2 
{
 public static void main(String... args) throws IOException
  {
    ByteArrayOutputStream bout = new ByteArrayOutputStream() ; 
    String s = "india is a good country" ;
    
    byte ch[] = s.getBytes() ;
    
    for(int i=0 ; i<ch.length ; i++)
     {
       bout.write(ch[i]) ;
       
     }
    bout.writeTo(new FileOutputStream("rabri.txt") )  ;
    bout.writeTo(new FileOutputStream("lalu.txt") )  ; 

    byte z[] = bout.toByteArray();
    
    ByteArrayInputStream bin = new ByteArrayInputStream(z) ;
    int i = 0 ;
    
    while( (i = bin.read() )!= -1 )
     {
       System.out.print( (char)i ) ;
      
     }
   }
}