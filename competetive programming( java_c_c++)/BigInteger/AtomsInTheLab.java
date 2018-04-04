import java.io.* ;
import java.util.* ;

import java.math.BigInteger;


public class AtomsInTheLab {

	static int solver(BigInteger num , BigInteger inc , BigInteger limit ) {
	
		int flag = 0 , t = 0 ;
		
		while(flag == 0) {
		  
			num = num.multiply(inc) ;
			t++ ;
			
			if(num.compareTo(limit) > 0 ) {  
				flag = 1 ;
				num = num.divide(inc) ;
				t-- ;
			}
		}	
		
		return t ;
		
	}
	public static void main(String[] args) throws IOException {
	 int tc ;
	 BigInteger n , k , m ;

	 Scanner sc = new Scanner(System.in) ;
     tc = sc.nextInt() ;

	 for(int i = 0 ; i < tc ; i++) {
		n = new BigInteger( sc.next() ) ;
		k = new BigInteger( sc.next() ) ;
		m = new BigInteger( sc.next() ) ;
		
		System.out.println(solver(n , k , m )); 
	 }
	 
	}

}
