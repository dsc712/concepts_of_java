import java.util.*  ;

class Temp{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>() ;
		al.add("java") ;
		al.add("cric") ;
		al.add("play") ;
		al.add("watch") ;
		al.add("glass") ;
		al.add("movie") ;

		System.out.println(al) ;

		Collections.swap(al , 2 , 5) ;

		System.out.println(al) ;
	}
}
