import java.io.* ;
import java.util.* ;
class MyScanner1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		int i = s.nextInt() ;
		double d = s.nextDouble() ;
		float f = s.nextFloat() ;
		long l = s.nextLong() ;

		System.out.println( i + d + f + l) ;
	}
}