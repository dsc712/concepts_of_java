/*
TreeMap is Red-Black tree based NavigableMap implementation. It is sorted according to the natural ordering of its keys.
TreeMap class implements Map interface similar to HashMap class. The main difference between them is that HashMap is an 
unordered collection while TreeMap is sorted in the ascending order of its keys. TreeMap is unsynchronized collection class
which means it is not suitable for thread-safe operations until unless synchronized explicitly.

constructors of TreeMap
=======================

 1. TreeMap() 
 2 . TreeMap(Comparator c ) 
 3 . TreeMap(Map m)
 4 . TreeMap(SortedMap sm )

   TreeMap implements NavigableMap which extends SortedMap and which further extends Map .
   ----------------------------------------------------------------------------------------


   NOTE : the key class must be implementing the comparable interface otherwise ClassCastException
   will be thrown . Since in below wriiten program we are inserting key as strings which by default implements
   Comparable interface therefore no problem .
   
*/

import java.util.* ;
class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String , String> hm = new TreeMap<String , String > () ;
		System.out.println(hm.size()) ;

		/* add elements to the TreeMap , since TreeMap is internally a Red-black tree which is a height 
		   balanced binary search tree the keys will be present in sorted order inside the treemap
		 */
		   hm.put("1004" , "dddd") ;
		   hm.put("1003" , "cccc") ;
		   hm.put("1002" , "bbbb") ;
		   hm.put("1001" , "aaaa") ;

		   show(hm) ;  // static method of TreeMapDemo class defined by us 

           SortedMap sm = hm.headMap("1003") ;
           System.out.println("smaller than 1003") ;
           show(sm) ;

           sm = hm.subMap("1002" , "1004") ;
           System.out.println("between 1002 and 1004") ;
           show(sm) ;

           sm = hm.tailMap("1002") ;
           System.out.println("greater than 1002") ;
           show(sm);
	}

	static void show(SortedMap sm){
		Set s = sm.entrySet() ;
		Iterator i = s.iterator() ;
		while(i.hasNext() ){
			Map.Entry e = (Map.Entry) i.next() ;
			String k = (String) e.getKey() ;
			String v = (String) e.getValue() ;
			System.out.println(k + " = " + v) ;
		}
	}


/*
output : 
======

0
1001 = aaaa
1002 = bbbb
1003 = cccc
1004 = dddd
smaller than 1003
1001 = aaaa
1002 = bbbb
between 1002 and 1004
1002 = bbbb
1003 = cccc
greater than 1002
1002 = bbbb
1003 = cccc
1004 = dddd


*/