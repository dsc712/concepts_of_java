import java.util.* ;
class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<Emp> al = new HashSet<>() ;
		System.out.println(al.size()) ; // 0
		al.add(new Emp(1002)) ;
		al.add(new Emp(1003)) ;
		al.add(new Emp(1002)) ; // does not add it and returns false , as duplicates are not allowed
		al.add(new Emp(1004)) ;
		al.add(new Emp(1001)) ;

        System.out.println(al.size()) ;
        Iterator<Emp> i = al.iterator() ;

        while(i.hasNext()){
        	Emp e = i.next() ;
        	System.out.println(e.id) ;
        }

        Emp e = new Emp(1002) ;
        System.out.println("Does set contains key ? " + al.contains(e)) ; // true 
        al.remove(e) ;
        i = al.iterator() ;
        System.out.println("after removing element") ;
        while(i.hasNext()){
        	Emp e1 = i.next() ;
        	System.out.println(e1.id);
        }
	}
}

// if hashset contains user defined class then we will have to override 
// equals() and hashcode() methods of Object class
class Emp{
 int id ;
 Emp(int id ){
 	this.id =id ;
 }

 @Override
 public boolean equals(Object o ){
 	System.out.println("inside equals") ;
 	Emp e = (Emp) o  ;
 	if(e.id == this.id ){
       return true ;
 	}else{
 		return false ;
 	}

 }

 @Override
 public int hashCode(){
 	System.out.println("inside hashcode ") ;
 	return id*10 ;
 }
}