import java.util.LinkedList ;
public class MyLastElement {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>() ;
		// al.add("first") ;
		// al.add("second") ;
		// al.add("third") ;
		// al.add("random") ;

		    System.out.println("Last Element : " + al.getLast() ) ;
		 // System.out.println("Last Element : " + al.peekLast() );

		System.out.println("List Element : " + al ) ;

	}
}

// getLast() : it returns the last element in the list , but if the list is empty then it returns exception (NoSuchElementException)
// peekLast() : Retrieves the last element in the list , but if the list is empty then it returns null 

// Test the functioning of above two functions by commenting and decommenting some portions of the above written programs