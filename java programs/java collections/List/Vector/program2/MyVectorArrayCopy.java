import java.util.* ; 
class MyVectorArrayCopy{
	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>() ;
		vct.add("first") ;
		vct.add("second") ;
		vct.add("third") ;
		vct.add("random") ;

		System.out.println("Actual vector : " + vct ) ;
		String[] copyArr = new String[vct.size()] ;
		vct.copyInto(copyArr) ;  // method comes from Enumeration interface
		System.out.println("copied Array contets is : ") ;
		for(String str : copyArr){
			System.out.println(str) ;
		}
	}
}