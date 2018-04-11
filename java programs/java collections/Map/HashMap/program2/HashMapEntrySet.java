import java.util.HashMap ;
import java.util.Map.Entry ;
import java.util.Set ;

public class HashMapEntrySet{
	public static void main(String[] args) {
		HashMap<String , String > hm = new HashMap<>() ;

        // add k-v pair to hashmap 
		hm.put("first" , "first inserted") ;
		hm.put("second" , "second inserted") ;
		hm.put("third" , "third inserted") ;

		System.out.println(hm) ;

		//getting value for the given key for hashmap
		Set< Entry< String , String > > entries = hm.entrySet() ;

		for (Entry<String , String > ent  : entries) {
			System.out.println(ent.getKey() + " ==> " + ent.getValue() ) ;
		}
	}
}