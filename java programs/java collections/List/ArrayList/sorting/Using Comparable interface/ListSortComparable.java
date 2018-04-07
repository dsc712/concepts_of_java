import java.util.* ;

class ListSortComparable {
	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<>() ;
		al.add(new Emp("Ram" , 5000)) ;
		al.add(new Emp("John" , 3000)) ;
		al.add(new Emp("Tom" , 7000)) ;
		al.add(new Emp("Raj" , 1500)) ;

		Collections.sort(al) ;
		System.out.println("Sorted List Entries  : ") ;
		for(Emp e : al){
            System.out.println(e.getSalary()) ;
		}

        
		Emp e1 = Collections.max(al) ;
		Emp e2 = Collections.min(al) ;

        System.out.println("Maximum value is : ") ;
		System.out.println(e1.salary) ;
	    System.out.println("Minimum value is : ") ;
		System.out.println(e2.salary) ;
	}
}

class Emp implements Comparable<Emp>{
	String name ; 
	int salary ;

	Emp(String name , int salary){
		this.name = name ;
		this.salary = salary ;
 	}

 	int getSalary(){
 		return salary ;
 	}
 	public int compareTo(Emp e){
 		return  ( this.salary - e.salary ) ;
 	}
}