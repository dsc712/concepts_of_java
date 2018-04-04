
// Stream tokenizer example without setting delimeters 

import static java.io.StreamTokenizer.TT_EOF ;
import static java.io.StreamTokenizer.TT_NUMBER ;
import static java.io.StreamTokenizer.TT_WORD ;

import java.io.IOException ;
import java.io.StreamTokenizer ;
import java.io.StringReader ;


class StreamTokenizerEx {
	public static void main(String[] args) {
		String str = "This is a test , 200 which is simple" ;
		StringReader sr = new StringReader(str) ;
		StreamTokenizer st = new StreamTokenizer(sr) ;

		try{
			while(st.nextToken() != TT_EOF){
				switch (st.ttype) {
					case TT_WORD : 
					   System.out.println("string value " + st.sval) ;
					   break ;
					case TT_NUMBER : 
					   System.out.println("Number " + st.nval  ) ;
					   break ;
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace() ;
		}
	}
}


/*

   Java StringReader class is a character stream with string as a source.
   It takes an input string and changes it into character stream. It inherits Reader class.
   In StringReader class, system resources like network sockets and files are not used,
   therefore closing the StringReader is not necessary.

*/