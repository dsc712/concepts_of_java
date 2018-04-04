import java.util.* ;

class ArrayListDemo{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>() ; // arraylist valid only for strings
		// ArrayList al = new ArrayList() ;
		System.out.println(al.size()) ;
		al.add("d") ;
		al.add("b") ;
		al.add("a") ;
		al.add("b") ;

	//	al.add(new Integer(10)) ;

		System.out.println(al.size()) ;
		al.remove(2) ;
		System.out.println(al.size()) ;
		System.out.println(al) ;
	}
}