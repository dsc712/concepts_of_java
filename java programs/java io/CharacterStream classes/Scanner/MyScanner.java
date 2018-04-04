/* You can't set your own delimeters in Scanner clas linke StreamTokenizer . Scanner class has whitespace as delimeter by default .*/

import java.io.* ;
import java.util.* ;

class MyScanner{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String s1 = " " ;
		while( !s1.equals("stop") ){
			//s1 = sc.nextLine() ;
			s1 = sc.next() ;
			System.out.println(s1) ;
		}
	}
}