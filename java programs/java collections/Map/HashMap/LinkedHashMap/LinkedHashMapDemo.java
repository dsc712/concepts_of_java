/*
  LinkedHashMap
  =============

  This class is a subclass of HashMap class . The elements of a LinkedHashMap are ordered . By
  default the entries of a LinkedHashMap are in Key-insertion order i.e order in which the keys are 
  inserted in the map . However LinkedHashMap can also maintain it's elements in access order 
  i.e order in which it's entries are accesed from most recently accesed . 


*/

import java.util.* ;
class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String , String> hm = new LinkedHashMap<>(10 , 0.75f , true) ;  // elements are ordered a/c to last access
	//	LinkedHashMap<String , String> hm = new LinkedHashMap<>(10 , 0.75 ) ; // elements are ordered a/c to insertion order

        System.out.println(hm.size()) ;
        hm.put("1003" , "aaaa") ;
        hm.put("1002" , "bbbb") ;
        hm.put("1001" , "cccc") ;
        hm.put("1004" , "dddd") ;

        Set s  = hm.entrySet() ;
        Iterator i = s.iterator() ;

        while(i.hasNext()){
        	Map.Entry e = (Map.Entry)i.next() ;
        	String k = (String) e.getKey() ;
        	String v = (String) e.getValue() ;
        	System.out.println(k + " = " + v) ;
        }

        String s1[] = {
        	"1001" ,
        	"1002" ,
        	"1003" ,
        	"1004" 
        } ;

        for(int i1 = 0 ; i1<s1.length ; i1++ ){
           System.out.println(hm.get(s1[i1])) ;
        }

        s = hm.entrySet() ;
        i = s.iterator() ;

        System.out.println(" ") ;

        while( i.hasNext() ){
        	Map.Entry e = (Map.Entry)i.next() ;
        	String k = (String)e.getKey() ;
        	String v = (String)e.getValue() ;
            System.out.println(k + " = " + v) ;
        }

	}
}


/*
  CONSTRUCTORS OF LinkedHashMap CLASS
  ===================================

  1	.

	LinkedHashMap( )
	This constructor constructs a default LinkedHashMap.

 2 .
	LinkedHashMap(Map m)
	This constructor initializes the LinkedHashMap with the elements from the given Map class m.

 3.
	LinkedHashMap(int capacity)
	This constructor initializes a LinkedHashMap with the given capacity.

 4.	
	LinkedHashMap(int capacity, float fillRatio)
	This constructor initializes both the capacity and the fill ratio. The meaning of capacity and fill ratio are the same
	as for HashMap.

 5.	
	LinkedHashMap(int capacity, float fillRatio, boolean Order)
	This constructor allows you to specify whether the elements will be stored in the linked list by insertion order, or
	by order of last access. If Order is true, then access order is used. If Order is false, then insertion order is used.

*/