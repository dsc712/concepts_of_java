import java.io.* ;

class MyFileWriter{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("ducat.txt") ;  // write mode
		//FileWriter fw = new FileWriter("ducat.txt",true) ; // append mode
		//FileWriter fw = new FileWriter("f:\\ducat.txt") ; // write mode in the specified location
		//FileWriter fw = new FileWriter("f:\\ducat.txt" , true) ; // append mode in the specified location 

		String s = "India is a good country" ;
		char ch[] = s.toCharArray() ;

		for ( int i=0 ; i<ch.length ; i++) {
			fw.write(ch[i]) ;
		}

		//   fw.write(ch) ;
        // fw.write(s) ;

        fw.close() ;
 
	}
}

