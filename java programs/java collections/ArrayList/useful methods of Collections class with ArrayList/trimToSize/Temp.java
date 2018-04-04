import java.util.* ;

class Temp{
	public static void main(String[] args) {
		Vector<Integer> al = new Vector<Integer>(50) ;

		System.out.println(al.capacity()) ;
		al.add(1) ;
		al.add(2) ;
		al.add(3) ;
		al.add(4) ;
		al.add(5) ;
		al.add(6) ;

		al.trimToSize() ;
		System.out.println(al.capacity()) ;
		System.out.println(al) ;
	}
}