import java.util.* ;

class ArrayToArrayList{
	public static void main(String[] args) {

		/* Array declaration and initialization */
		String citynames[] = {"Agra" , "Delhi" , "Mysore" , "Chandigarh"} ;
		List<String> list = Arrays.asList(citynames) ;

		/* Array to ArrayList conversion */
		ArrayList<String> al = new ArrayList<String>(list) ;

		al.add("new city 2") ;
		al.add("new city 3") ;

		for(String str : al){
			System.out.println(str) ;
		}

	}
}