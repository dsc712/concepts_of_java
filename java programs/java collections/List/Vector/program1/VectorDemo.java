import java.util.* ;

class VectorDemo {
	public static void main(String[] args) {
		Vector<String> al = new Vector<>(3 , 2 ) ;  // Vector(int capacity , int increment)
		System.out.println("ini" + al.capacity() ) ;
		System.out.println(al.size() ) ;
		al.removeElementAt(2) ; // this method comes from Enumeration interface

		al.addElement("a") ;
		al.addElement("b") ;
		al.addElement("a") ;
		al.addElement("b") ;

		System.out.println(" cap " + al.capacity() ) ;
		System.out.println(al.size() ) ;
		al.removeElementAt(2) ;

		Enumeration<String> e1 = al.elements() ;
		while(e1.hasMoreElements() ) {
			String s = e1.nextElement() ;
			System.out.println(s) ;
		}
		Iterator<String> e = al.iterator() ;
		while(e.hasNext() ){
			String s = e.next() ;
			System.out.println(s) ;
		}
		al.trimToSize() ;
		System.out.println("\n " +  al.capacity() ) ;
	}
}