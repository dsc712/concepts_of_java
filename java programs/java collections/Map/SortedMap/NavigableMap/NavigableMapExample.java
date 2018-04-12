import java.util.* ;

/*
 
  Java program to demonstrate What is NavigableMap in Java and How to use NavigableMap
  in Java. NavigableMap provides two important features navigation methods
  like lowerKey(), floorKey, ceilingKey() and higherKey() , e.t.c 
  There Entry counterpart and methods to create subMap e.g. headMap(), tailMap()
  and subMap().
 
 */
public class NavigableMapExample {

    public static void main(String args[]) {
      
        //NavigableMap extends SortedMap to provide useful navigation methods
        NavigableMap<String, String> navigableMap = new TreeMap<String, String>();
      
        navigableMap.put("C++", "Good programming language");
        navigableMap.put("Java", "Another good programming language");
        navigableMap.put("Scala", "Another JVM language");
        navigableMap.put("Python", "Language which Google use");
      
        System.out.println("SorteMap : " + navigableMap);
      
        //lowerKey returns key which is less than specified key
        System.out.println("lowerKey from Java : " + navigableMap.lowerKey("Java"));
      
        //floorKey returns key which is less than or equal to specified key
        System.out.println("floorKey from Java: " + navigableMap.floorKey("Java"));
      
        //ceilingKey returns key which is greater than or equal to specified key
        System.out.println("ceilingKey from Java: " + navigableMap.ceilingKey("Java"));
      
        //higherKey returns key which is greater specified key
        System.out.println("higherKey from Java: " + navigableMap.higherKey("Java"));

        // firstEntry() method returns the first entry in navigableMap
        System.out.println("first entry : " + navigableMap.firstEntry() ) ;

         // lastEntry() method returns the lastt entry in navigableMap
        System.out.println("last entry : " + navigableMap.lastEntry() ) ;
      
        Map.Entry higherEntry = navigableMap.higherEntry("java") ;
        System.out.println(higherEntry) ;

        Map.Entry lowerEntry = navigableMap.lowerEntry("java") ;
        System.out.println(lowerEntry) ;
      
        //Apart from navigagtion method, it also provides useful method
        //to create subMap from existing Map e.g. tailMap, headMap and subMap
      
        //an example of headMap - returns NavigableMap whose key is less than specified
        NavigableMap<String, String> headMap = navigableMap.headMap("Python", false);
        System.out.println("headMap created form navigableMap : " + headMap);
              
        //an example of tailMap - returns NavigableMap whose key is greater than specified
        NavigableMap<String, String> tailMap = navigableMap.tailMap("Scala", false);
        System.out.println("tailMap created form navigableMap : " + tailMap);
      
        //an example of subMap - return NavigableMap from toKey to fromKey
        NavigableMap<String, String> subMap = navigableMap.subMap("C++", false ,
                                                                  "Python", false);
        System.out.println("subMap created form navigableMap : " + subMap);
    }
}


/*
  output
  ------

SorteMap : {C++=Good programming language, Java=Another good programming language, Python=Language which Google use, Scala=Another JVM language}
lowerKey from Java : C++
floorKey from Java: Java
ceilingKey from Java: Java
higherKey from Java: Python
first entry : C++=Good programming language
last entry : Scala=Another JVM language
null
Scala=Another JVM language
headMap created form navigableMap : {C++=Good programming language, Java=Another good programming language}
tailMap created form navigableMap : {}
subMap created form navigableMap : {Java=Another good programming language}

*/