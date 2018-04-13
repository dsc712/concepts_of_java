/*

What is ConcurrentHashMap and how it is implemented in Java
============================================================
ConcurrentHashMap is introduced as an alternative of Hashtable and provided all functions 
supported by Hashtable with an additional feature called "concurrency level", which allows 
ConcurrentHashMap to partition Map. ConcurrentHashMap allows multiple readers to read 
concurrently without any blocking. This is achieved by partitioning Map into different 
parts based on concurrency level and locking only a portion of Map during updates.
Default concurrency level is 16, and accordingly Map is divided into 16 part and each part 
is governed with a different lock. This means, 16 thread can operate on Map simultaneously 
until they are operating on different part of Map. This makes ConcurrentHashMap high 
performance despite keeping thread-safety intact.  Though, it comes with a caveat. 
Since update operations like put(), remove(), putAll() or clear() is not synchronized, 
concurrent retrieval may not reflect most recent change on Map.

 In case of putAll() or clear(), which operates on whole Map, concurrent read may 
 reflect insertion and removal of only some entries. Another important point to remember
 is iteration over CHM, Iterator returned by keySet of ConcurrentHashMap are weekly 
 consistent and they only reflect state of ConcurrentHashMap and certain point and 
 may not reflect any recent change. Iterator of ConcurrentHashMap's keySet area also 
 fail-safe and doesn’t throw ConcurrentModificationExceptoin..

Default concurrency level is 16 and can be changed, by providing a number which make 
sense and work for you while creating ConcurrentHashMap. Since concurrency level is 
used for internal sizing and indicate number of concurrent update without contention, so, if
you just have few writers or thread to update Map keeping it low is much better. 
ConcurrentHashMap also uses ReentrantLock to internally lock its segments.

Handling race condition in ConcurrentHashMap --> using putIfAbsent( Key , Value )
============================================
synchronized(map){
  if (map.get(key) == null){
      return map.put(key, value);
  } else{
      return map.get(key);
  }
}

Though this code will work fine in HashMap and Hashtable, This won't work in ConcurrentHashMap
because, during put operation whole map is not locked, and while one thread is putting value, 
other thread's get() call can still return null which result in one thread overriding value 
inserted by other thread. Ofcourse, you can wrap whole code in synchronized block and make it 
thread-safe but that will only make your code single threaded. ConcurrentHashMap provides
putIfAbsent(key, value) which does same thing but atomically and thus eliminates above race condition. 

some important points about ConcurrentHashMap in Java.
=====================================================

1. ConcurrentHashMap allows concurrent read and thread-safe update operation.

2. During the update operation, ConcurrentHashMap only locks a portion of Map instead of whole Map.

3. The concurrent update is achieved by internally dividing Map into the small portion which is defined 
   by concurrency level.

4. Choose concurrency level carefully as a significantly higher number can be a waste of time and space
   and the lower number may introduce thread contention in case writers over number concurrency level.

5. All operations of ConcurrentHashMap are thread-safe.

6. Since ConcurrentHashMap implementation doesn't lock whole Map, there is chance of read overlapping 
   with update operations like put() and remove(). In that case result returned by get() method will 
   reflect most recently completed operation from there start.

7. Iterator returned by ConcurrentHashMap is weekly consistent, fail-safe and never throw 
   ConcurrentModificationException. In Java.

8. ConcurrentHashMap doesn't allow null as key or value.

9. You can use ConcurrentHashMap in place of Hashtable but with caution as CHM doesn't lock whole Map.

10. During putAll() and clear() operations, the concurrent read may only reflect insertion or deletion of
    some entries.

Use ConcurrentHashMap in Java program, when there will be more reader than writers and it’s a good
choice for creating cache in Java as well.

*/

import java.util.HashMap ;
import java.util.Iterator ;
import java.util.Map ;
import java.util.concurrent.ConcurrentHashMap ;
public class ConcurrentHashMapEx {
   public static void main(String[] args) {

    	//concurrent HashMap

   	    Map<String ,String > myMap = new ConcurrentHashMap<String , String>() ;
   	    myMap.put("1" , "1") ;
   	    myMap.put("2" , "1") ;
   	    myMap.put("3" , "1") ;
   	    myMap.put("4" , "1") ;
   	    myMap.put("5" , "1") ;
   	    myMap.put("6" , "1") ;

        System.out.println("concurrent hashmap before iterator : " + myMap ) ;
        Iterator<String> it = myMap.keySet().iterator() ;

        while(it.hasNext()){
        	String key = it.next() ;
        	if(key.equals("3")) {
        		myMap.put(key + "new","new3") ;  // NO ConcurrentModification Exception 
        	}
        }
        System.out.println("concurrent HashMap after iterator : " + myMap ) ;

        // Now let's repeat the same story with HashMap this time 

        //HashMap
        myMap = new HashMap<String , String > () ;
        myMap.put("1" , "1") ;
   	    myMap.put("2" , "1") ;
   	    myMap.put("3" , "1") ;
   	    myMap.put("4" , "1") ;
   	    myMap.put("5" , "1") ;
   	    myMap.put("6" , "1") ;
        
        System.out.println("HashMap before iterator : " + myMap ) ;
        Iterator<String> it1 = myMap.keySet().iterator() ;

        while(it1.hasNext()){
        	String key = it1.next() ;
        	if(key.equals("3")){
        		myMap.put(key + "new" , "new3") ;  // ConcurrentModification Exception will be thrown here
        	}
        }
        System.out.println("HashMap after iterator : " + myMap ) ;
    } 
}
