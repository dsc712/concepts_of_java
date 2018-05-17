import java.util.* ;
class HashSetDemo{
	public static void main(String[] args) {
		HashSet<String> al = new HashSet<>() ;
		System.out.println(al.size()) ; // prints 0 
		al.add("a") ;
		al.add("b") ;
		al.add("c") ;

		System.out.println(al.add("c")) ;  // false - as duplicates can't be added 
		System.out.println(al.size()) ; // 3
		System.out.println(al) ;  // [a , b, c ]

	}
}