import java.util.ArrayList ;
import java.util.Collections ;

class MyArrayListReverse {
	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<Emp>() ;
		list.add(new Emp(1001)) ;
		list.add(new Emp(1002)) ;
		list.add(new Emp(1003)) ;
		list.add(new Emp(1004)) ;
		list.add(new Emp(1005)) ;
		
		System.out.println("Actual list : ") ;

		for(Emp e : list){
			System.out.print(e.id + " ") ;
		}

       System.out.println() ;

		Collections.reverse(list) ;
		System.out.println("Result after reverse operation") ;
		for(Emp e1 : list){
			System.out.print(e1.id + " ") ;
		}
 	}
}

class Emp{
	int id ;
	Emp(int id ){
		this.id = id ;
	}
}