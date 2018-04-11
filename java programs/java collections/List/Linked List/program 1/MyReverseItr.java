import java.util.* ;
public class MyReverseItr{
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>() ;
		al.add("first") ;
		al.add("second") ;
		al.add("third") ;
		al.add("random") ;

       // descending iterator - it shows that internally it is a doubly linked list
		Iterator<String> itr = al.descendingIterator() ;
		while(itr.hasNext()){
			System.out.println(itr.next()) ;
		}  
	}
} 