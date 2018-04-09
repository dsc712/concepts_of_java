/* ensureCapacity() increases the performanace , as repeatedly growing the size of arraylist dynamically is a heavyweight process .So
 if you think that array list is going to grow rapidly then you can use this method .*/

import java.util.* ;
class EnsureCapacityExample{
	public static void main(String[] args) {
		Vector<String> al = new Vector<>(4) ;
		System.out.println(al.capacity() ) ;

		// added 4 elements

		al.add("Hi") ;
		al.add("Hello") ;
		al.add("Bye") ;
		al.add("GM") ;

		// increase capacity 

		al.ensureCapacity(76) ;
		System.out.println(al.capacity()) ;
		System.out.println(al) ;

		al.add("GE") ;
		al.add("GE") ;
		al.add("GE") ;

		for(String temp : al){
			System.out.println(temp) ;
 		}
	}
}