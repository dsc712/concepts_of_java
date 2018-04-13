/*
-----------------------------------------------------------------
| NOTE : first see types_of_references.txt in current directory  |
-----------------------------------------------------------------

I hope you read it , now you are ready to move further ,

  WeakHashMap
  ===========

  It is exactly same as Hashmap except the below difference :-

  HashMap object is not eligible for garbage collector even though it 
  does not have any external references .
  Keys of WeakHashMap has weak reference i.e if the key is garbage collected ,
  then entry in WeakHashMap object will be deleted automatically .
  This is not the case in HashMap .


*/

/*
   important note about below program :
   ==================================

   If you do not include the call to System.gc(), the system may never run the garbage collector
   as not much memory is used by the program. For a more active program, the call would be unnecessary.
   
*/
import java.util.HashMap ;
import java.util.Map ;
import java.util.WeakHashMap ;

public class WeakHashMapExample{
	public static void main(String[] args) {
		Map hm = new HashMap() ;
		Map whm = new WeakHashMap() ;

		Temporary t1 = new Temporary() ;  // object created for testing HashMap
		Temporary t2 = new Temporary() ;  // object created for testing WeakHashMap

		hm.put(t1 , "sai") ;
		System.out.println("Before hashmap gets garbage collected") ;
		System.out.println(hm) ;

		t1 = null ;  // removing external strong reference
		System.gc() ;  

		System.out.println("After hashmap gets garbage collected ") ; 
		System.out.println(hm) ;

		whm.put(t2 , "sai") ;
		System.out.println("before WeakHashMap gets garbage collected ") ;
		System.out.println(whm) ;

		t2=null ;   // removing external strong reference
		System.gc() ;

		System.out.println("After WeakHashMap gets garbage collected " ) ;
		System.out.println(whm) ;

	}
}

class Temporary{
	public String toString(){
		return "Temporary" ;
	}
	public void finalize(){
		System.out.println(" finalize() method called ") ;
	}
}


/*

output :
=======

Before hashmap gets garbage collected
{Temporary=sai}
After hashmap gets garbage collected
{Temporary=sai}
before WeakHashMap gets garbage collected
{Temporary=sai}
After WeakHashMap gets garbage collected
 finalize() method called
{}

*/