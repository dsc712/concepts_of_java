// this program illustrates all the possible ways to iterate a linkedlist
import java.util.* ;
public class LinkedListLoop{
	public static void main(String[] args) {
		/* LinkedList declaration */
		LinkedList<String> ll = new LinkedList<>() ;
		ll.add("Apple") ;
		ll.add("Orange") ;
		ll.add("Mango") ;

		/* for loop */

		for(int num = 0 ; num < ll.size()  ; num++ ){
			System.out.println(ll.get(num)) ;
		}

		/* advanced for loop */

		for(String str : ll){
			System.out.println(str) ;
		}

		/* using iterator*/
		Iterator<String> itr = ll.iterator() ;
		while(itr.hasNext()){
			System.out.println(itr.next()) ;
		}

		/* using while loop */
		int num = 0 ;
		while( ll.size() > num ){
			System.out.println(ll.get(num)) ;
			num++ ;
		}
	}
}