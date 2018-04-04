import java.io.* ;

class MyCharWriter {

	public static void main(String[] args) throws IOException{

		CharArrayWriter fw = new CharArrayWriter() ;
		FileWriter fo = new FileWriter("abc.txt")  ;
        FileWriter fo1 = new FileWriter("abc1.txt") ;

		String s = "India is a good country" ;
		char ch[] = s.toCharArray() ;

         // writing into character array 
		  fw.write(s) ;  // fw.write(ch) ;


         // writing same stream to multiple files 
		fw.writeTo(fo) ;
		fw.writeTo(fo1) ;

        fo1.close() ;
		fo.close() ;
        
        System.out.println( fw.toString() ) ;

		char z[] = fw.toCharArray() ;

        CharArrayReader fr = new CharArrayReader(z) ;

		int i = 0 ;

		while( ( i=fr.read() ) != -1 ){
			System.out.print( (char)i ) ;
		}

	}

}