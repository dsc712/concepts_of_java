//This program illustrates how an ArrrayList can contain another ArrayList
import java.util.* ;

class ArrayListDemo3{
	public static void main(String[] args) {
		ArrayList<ArrayList> al = new ArrayList<>() ;
		ArrayList<String> als = new ArrayList<>() ;

		System.out.println( al.size() ) ;  // prints 0

		als.add("a") ;
		als.add("b") ;
		als.add("c") ;

		al.add(als) ;
	    al.add(al) ;

	    System.out.println( al.size() ) ;  // prints 2
	}
}