import java.io.* ;
class MyConsole{
	public static void main(String[] args) throws IOException{
		Console cs = System.console() ;
		if(cs != null){
			System.out.println("console is available") ;
			System.out.println("enter the line") ;
			String s1 = cs.readLine() ;
			System.out.println(s1) ;
			String s2 = cs.readLine("enter the name(%d chars) : " , 5) ;
			System.out.println(s2) ;
			System.out.println("enter password : ") ;
			char ch[] = cs.readPassword() ;
			char ch1[] = cs.readPassword("Enter pwd") ;

			Reader r = cs.reader() ;
			int x = r.read() ;
			System.out.println(x) ;
			PrintWriter pw = cs.writer() ;
			pw.println("console via printwriter") ;
		}
	}
}