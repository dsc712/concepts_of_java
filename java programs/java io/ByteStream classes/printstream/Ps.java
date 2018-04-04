import java.io.* ;

class Ps{
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("Chachi.txt") ;
		PrintStream ps = new PrintStream(fout) ;
		System.out.println("before") ;  // it will still print to console
        PrintStream ps1 = System.out ;
        System.setOut(ps) ;
        System.setErr(ps1) ;
        System.out.println("chachi 420") ;  //Prints to file
        System.out.println("chachi 840") ;  //Prints to file
        System.err.println("chacha 420") ;  //Prints to console
        System.err.println("chacha 840") ;  //Prints to console
       // System.out = ps4 ;
        System.out.println("chacha 240") ;
        System.setOut(ps1) ;

        ps1.println("after") ; // prints to console
        System.out.println("via actual out") ;//prints to console
	}
}