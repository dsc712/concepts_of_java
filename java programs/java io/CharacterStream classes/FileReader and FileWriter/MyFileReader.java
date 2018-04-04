import java.io.* ;

class MyFileReader{
	public static void main(String[] args) throws IOException{
		
      FileReader fr = new FileReader("ducat.txt") ;

      int i = 0 ;

      while( (i = fr.read() ) != -1 ){
      	System.out.print( (char)i ) ;
      } 
	}
}

