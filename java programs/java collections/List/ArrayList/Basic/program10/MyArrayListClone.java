import java.util.ArrayList ; 
public class MyArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String> () ;

		// adding elements to the end 

		al.add("first") ;
		al.add("second") ;
		al.add("third") ;
		al.add("random") ;

		System.out.println("Actual ArrayList : " + al ) ;
		ArrayList<String> copy = (ArrayList<String>)al.clone() ;
		System.out.println("Cloned ArrayList : " + copy ) ;

		if(al.get(0) == copy.get(0) ){
			System.out.println("shallow") ;
		}
		if( al != copy ){
			System.out.println("clone") ;
		}
	}
}