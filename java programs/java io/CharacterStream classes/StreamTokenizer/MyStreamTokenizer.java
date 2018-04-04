/*
   The Java InputStreamReader class (java.io.InputStreamReader) is intended to wrap
   an InputStream, thereby turning the byte based input stream into a character based Reader.
   The Java InputStreamReader is often used to read characters from files (or network connections)
   where the bytes represents text. For instance, a text file where the characters are encoded as UTF-8.
   You could use an InputStreamReader to wrap a FileInputStream in order to read such a file.

*/


// Stream tokenizer example by setting delimeters 
   
import java.io.* ;

class MyStreamTokenizer {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("abc.txt") ;
		InputStreamReader ir = new InputStreamReader(fin) ;

		StreamTokenizer st = new StreamTokenizer(ir) ;
		st.eolIsSignificant(true) ;  // end of lines will be treated as tokens
		st.wordChars(32,255) ;   // characters in this range is word constituents
		st.whitespaceChars(0 , 32) ; // characters in this range are treated as white space chars
           
        int token = 0 , count = 0;

        while(true){
        	token = st.nextToken() ;

        	if(token == StreamTokenizer.TT_EOF) 
        	  break ;

        	if(token == StreamTokenizer.TT_NUMBER)
        		System.out.println(st.nval + " number ") ;

        	if(token == StreamTokenizer.TT_WORD)
        		System.out.print(st.sval + " word ") ;

        	count++ ;
        }

        System.out.println(" no. of words " + count) ;

	}
}



/*

Following are the fields for Java.io.StreamTokenizer class −

double nval − If the current token is a number, this field contains the value of that number.

String sval − If the current token is a word token, this field contains a string giving the characters of the word token.

static int TT_EOF − A constant indicating that the end of the stream has been read.

static int TT_EOL − A constant indicating that the end of the line has been read.

static int TT_NUMBER − A constant indicating that a number token has been read.

static int TT_WORD − A constant indicating that a word token has been read.

int ttype − After a call to the nextToken method, this field contains the type of the token just read.

*/