import java.util.* ;

public class LinkedListExampleEmp{
	public static void main(String[] args) {
		LinkedList<Emp> ll = new LinkedList<>() ;

        // all the employees belong to lalu family , joke time ha ha 
		ll.add( new Emp(1001 , "lalu") ) ;
		ll.add( new Emp(1002 , "rabri") ) ;
		ll.add( new Emp(1003 , "meesa") ) ;
		ll.add( new Emp(1004 , "tejas") ) ;

		Iterator<Emp> i = ll.iterator() ;
		while( i.hasNext() ){
			Emp e = i.next() ;
			System.out.println(e.id + " "  + e.name) ;
		}

		/* Add first and Last element - 2 new employees coming */
        ll.addFirst(new Emp(100 , "nitish") ) ;
        ll.addLast(new Emp(200 , "mulayam") ) ;

        System.out.println("linked list content after addition : ") ;
        i = ll.iterator() ;
        while( i.hasNext() ){
			Emp e = i.next() ;
			System.out.println(e.id + " "  + e.name) ;
		}

		/* setting and getting values in linked list  is similar to arraylist */
		Emp firstVar = (Emp)ll.get(0) ;
		System.out.println("first element : " + firstVar.id + " " + firstVar.name ) ;
		Emp e2 = new Emp(420 , "ghajni420") ;
		ll.set(0 , e2) ;
		firstVar = (Emp)ll.get(0) ;
		System.out.println("first element afer update by set() : " + firstVar.id + " " + firstVar.name ) ;

		/* Remove first and last element */
		ll.removeFirst() ;
		ll.removeLast() ;
		System.out.println("linked list after removing first and last element " ) ;
		i = ll.iterator() ;
		while(i.hasNext()){
			Emp e = i.next() ;
			System.out.println(e.id + " " + e.name) ;
		}

		/* Add to a position and remove from a position */
		e2 = new Emp(421 , "ghajni421") ;
		ll.add(0 , e2 ) ;
		ll.remove(2) ;
		System.out.println("final content : ") ;
		i = ll.iterator() ;
		while(i.hasNext()){
			Emp e = i.next() ;
			System.out.println(e.id + " " + e.name ) ; 
		}

		firstVar = (Emp)ll.getFirst() ;
		Emp lastVar = (Emp) ll.getLast() ;

		System.out.println("first element : " + firstVar.id + " " + firstVar.name ) ;
		System.out.println("last element : " + lastVar.id + " " + lastVar.name ) ;
	}
}

class Emp {
	int id ; 
	String name ;
	Emp(int id , String name ){
		this.id = id ;
		this.name = name ;
	}
}