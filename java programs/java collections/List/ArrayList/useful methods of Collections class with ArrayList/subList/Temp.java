import java.util.* ;

class Temp{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>() ;
		// adding elements to the end
		al.add("first") ;
		al.add("second") ;
		al.add("third") ;
		al.add("fourth") ;
		al.add("fifth") ;
		al.add("sixth") ;


		System.out.println("Actual ArrayList : " + al) ;
		List<String> list = al.subList(2,4) ;
		System.out.println("sublist : " + list ) ;
	}
}