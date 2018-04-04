import java.io.* ;

class BStream1{

public static void main(String... s){
  
 String str = " i love my country from bottom of my heart ... " ;
 try(FileOutputStream fout =new FileOutputStream("lalu.txt") ;
     BufferedOutputStream bout = new BufferedOutputStream(fout) )
  {
    byte ch[] = str.getBytes() ;
    
    bout.write(ch) ;
    System.out.println("\n file created successfully"); 
   }
  catch(Exception e)
   {
    System.out.println(e) ; 
   }
}

}