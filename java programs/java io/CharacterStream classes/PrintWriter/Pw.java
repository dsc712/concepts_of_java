import java.io.* ;

class Pw{
	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter( new FileWriter("ducat.txt") ) ;
		pw.println("Hello") ;
		pw.println("Hi") ;
		pw.close() ;
		System.out.println("file created") ;
	}
}