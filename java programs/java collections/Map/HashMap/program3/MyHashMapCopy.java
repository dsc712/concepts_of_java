import java.util.HashMap ;

public class MyHashMapCopy {
	public static void main(String[] args) {
		HashMap<String , String> hm = new HashMap<>() ;

		//add key-value pair to hashmap 
		hm.put("first" , "first inserted") ;
		hm.put("second" , "second inserted") ;
		hm.put("third" , "third inserted") ;

		System.out.println(hm) ;

		HashMap<String , String> submap = new HashMap<>() ;


       // add two key-value pairs to submap
		submap.put("s1" , "s1 value") ;
		submap.put("s2" , "s2 value") ;

		hm.putAll(submap) ;  // putting one hashmap into another
		System.out.println(hm) ;  

	}
}