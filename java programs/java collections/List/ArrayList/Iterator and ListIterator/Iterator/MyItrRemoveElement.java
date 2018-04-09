import java.util.ArrayList ; 
import java.util.Iterator ;
import java.util.List ;

public class MyItrRemoveElement{
	public static void main(String[] args) {
		String removeElem = "Perl" ;
		List<String> myList = new ArrayList<String>() ;
		myList.add("java") ;
		myList.add("unix") ;
		myList.add("Oracle") ;
		myList.add("c++") ;
		myList.add("Perl") ;
		myList.add("Perl") ;
		myList.add("Perl") ;

		System.out.println("Before remove") ;
		System.out.println(myList) ;

        // order : hey iterator !! remove Perl from arraylist , i just hate it .. 
		Iterator<String> itr = myList.iterator() ;
		while( itr.hasNext() ){
			if(removeElem.equals( itr.next() ) ){
				itr.remove() ;   // once iterator started you cannot do myList.remove() as iterator is fail fast and doing so will result in 
				                 // concurrent modification exception 
			}
		}

		System.out.println("After remove ") ;
		System.out.println(myList) ;
	}
}