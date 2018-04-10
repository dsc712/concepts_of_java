/*
   
The synchronizedList is a convenience wrapper that allows you to avoid manual synchronization in
most cases, but not when iterating over it.
With a normal unsynchronized list, you would need to always manually synchronize if it is used 
by multiple threads, thus it can be handy to use synchronizedList.
A case where a synchronizedList are necessary might be if you pass a list to some third-party
code that does not synchronize on the list, but you still need synchronization. However, this
is quite error-prone as you would rely on the fact that the third-party code does not iterate
over the list or use other non-atomic operations, thus it would be best to avoid this altogether
if possible (for example, by copying the list).

*/
import java.util.* ;

public class SynchronizedArrayList {
	public static void main(String[] args) {

		// always pass anonymous arraylist to this method to avoid breaking of synchronization due to the strong reference present somewhere else
		List<String> syncal = Collections.synchronizedList( new ArrayList<String>() ) ; /* this will make a synchronized 
		                                                                                  arraylist which can be used by multiple threads  */

		// adding elements to the synchronized arrayist

		syncal.add("Pen") ;
		syncal.add("Notebook") ;
		syncal.add("Ink") ;

        // this convenient wrapper do not provide synchroniztion while iterating it 
		System.out.println("Iterating synchronized arraylist : ") ;
		// While Iterating over synchronized list, you must synchronize
		// on it to avoid non-deterministic behavior
		synchronized(syncal){
            Iterator<String> itr = syncal.iterator() ;

            while( itr.hasNext() ){

            	String stationaryItem = itr.next() ;
            	System.out.println(stationaryItem) ;
            }

		} 
	}
}