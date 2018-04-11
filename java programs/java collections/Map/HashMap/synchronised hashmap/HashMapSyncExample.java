import java.util.Collections ;
import java.util.HashMap ;
import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;

public class HashMapSyncExample {
	public static void main(String[] args) {
		Map map = Collections.synchronizedMap(new HashMap<Integer , String>() ) ;
		map.put(2 , "Anil" ) ;
		map.put(44 , "Ajit" ) ;
		map.put(4 , "Sachin" ) ;
		map.put(88 , "xyz" ) ;

		Set set = map.entrySet() ;

		synchronized(map){
			Iterator i = set.iterator() ;

			// display elements 
			while( i.hasNext() ){
				Map.Entry me = (Map.Entry) i.next() ;
				System.out.println(me.getKey() + " : ") ;
				System.out.println(me.getValue() ) ;
			}
		}
	}
}


/*
   
Iteration over collections in Java is not thread safe, even if you are using one of the 
synchronized wrappers (Collections.synchronizedMap(...)):

It is imperative that the user manually synchronize on the returned map when
iterating over any of its collection views:

Map m = Collections.synchronizedMap(new HashMap());
...
Set s = m.keySet();  // Needn't be in synchronized block
...
synchronized(m) {  // Synchronizing on m, not s!
    Iterator i = s.iterator(); // Must be in synchronized block
    while (i.hasNext())
        foo(i.next());
}


Java Collection Framework docs
Other calls to synchronized collections are safe, as the wrapper classes surround them with 
synchronized blocks, which use the wrapper collection as their monitor:

public int size() {
    synchronized( this ) {
        return collection.size();
    }
}

with collection being the original collection. This works for all methods exposed by a collection/map,
except for the iteration stuff.

The key set of a map is made synchronized just the same way: the synchronized wrapper does not return
the original key set at all. Instead, it returns a special synchronized wrapper of the collection's 
original key set. The same applies to the entry set and the value set.


*/