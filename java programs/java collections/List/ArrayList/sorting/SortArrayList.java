import java.util.* ; 
public class SortArrayList{
	public static void main(String[] args) {
		ArrayList<String> listOfCountries = new ArrayList<>() ;
		listOfCountries.add("India".toLowerCase() ) ;
		listOfCountries.add("japan".toLowerCase()) ;
		listOfCountries.add("afghanistan".toLowerCase()) ;
		listOfCountries.add("america".toLowerCase()) ;
		listOfCountries.add("korea".toLowerCase()) ;

		// unsorted list
		 System.out.println("before sorting \n" + listOfCountries ) ;

		 Collections.sort(listOfCountries) ;

        // sorted list 
		 System.out.println("after sorting \n" + listOfCountries) ;

	
 	}
}