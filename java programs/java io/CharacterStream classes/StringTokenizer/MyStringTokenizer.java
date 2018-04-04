import java.io.* ;
import java.util.* ;

class MyStringTokenizer {
	public static void main(String[] args) {
		String s = "country = India ; capital = delhi ;"  ;
		StringTokenizer st = new StringTokenizer(s , "= ;") ;

		while( st.hasMoreTokens() ){
			System.out.println(st.nextToken()) ;
		}
	}
}