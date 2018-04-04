import java.io.* ;

class Temp{

public static void main(String... args) throws IOException
{
 
 FileOutputStream fout = new FileOutputStream("lalu.txt");
 PrintStream ps = new PrintStream(fout) ;

 System.out.println("hello") ;  // it will be printed on console
 
 System.setOut(ps) ;
 
 System.out.println("hi") ;     // it will be printed inside file due to setOut() method

}

}