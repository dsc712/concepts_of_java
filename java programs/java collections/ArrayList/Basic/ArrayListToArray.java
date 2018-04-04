import java.util.* ;
class ArrayListToArray{
	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<>() ;
		arrlist.add("string1") ;
		arrlist.add("string2") ;
		arrlist.add("string3") ;
		arrlist.add("string4") ;

		/*  ArrayList to Array Conversion */

		String array[] = new String[arrlist.size()] ;

		for(int i = 0 ; i<arrlist.size() ; i++){
			array[i] = arrlist.get(i) ;
		}

		/*  Displaying Array elements */
		for(String k : array){
			System.out.println(k) ;
		}
	}
}