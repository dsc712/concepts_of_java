import java.lang.reflect.* ;
import java.awt.* ;

class SamplePackage {
	static  void printPackage(Object o){
		Class c = o.getClass() ;
		Package pk = c.getPackage() ;
		System.out.println(pk.getName()) ;
	}

	public static void main(String[] args) {
		String t = new String("ss") ;
		printPackage(t) ;
	}
}