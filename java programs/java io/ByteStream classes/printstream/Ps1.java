import java.io.* ;

class Ps1{

public static void main(String... args) throws IOException
{
 FileOutputStream fout = new FileOutputStream("lalu.txt" , true) ; //append mode
 PrintStream ps = new PrintStream(fout);

 ps.println( "new line appended to lalu.txt through println " ) ;
 
 System.out.println(" File successfully created  ") ;  // it will still print in console

 System.setOut(ps) ;

 System.out.println(" File successfully created  ") ; // it will print in file
 }

}