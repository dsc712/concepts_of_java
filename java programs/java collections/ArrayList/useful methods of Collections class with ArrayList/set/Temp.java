import java.util.* ;

class Temp{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>() ;
		al.add(1) ;
		al.add(2) ;
		al.add(3) ;
		al.add(4) ;

		System.out.println("ArrayList before update : " + al) ;

		al.set(0 , 11) ;
		al.set(1 , 22) ;
		al.set(2 , 33) ;
		al.set(3 , 44) ;

		System.out.println("ArrayList after update : " + al) ;
 
	}
}