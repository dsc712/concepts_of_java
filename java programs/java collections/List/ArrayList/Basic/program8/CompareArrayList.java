import java.util.* ;

class CompareArrayList{
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>() ;
		al1.add("hi") ;
		al1.add("good morning") ;
		al1.add("bye") ;
		al1.add("good night") ;

		ArrayList<String> al2 = new ArrayList<String>() ;

		al2.add("howdy") ;
		al2.add("Good Evening") ;
		al2.add("bye") ;
		al2.add("good night") ;

		// storing the comparison output in ArrayList<String>

		ArrayList<String> al3 = new ArrayList<>() ;

		for(String temp : al1){
			al3.add(al2.contains(temp) ? "Yes" : "No" ) ;
		}

		System.out.println(al3) ;
	}
}