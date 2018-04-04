class Temp<T>{
	T x ;
	T y ;
	Temp(T x , T y ) {
		this.x = x ;
		this.y = y ;
	}
	void show(){
		System.out.println(x) ;
		System.out.println(y) ;
	}

	public static void main(String[] args) {
		Temp<Integer> t1 = new Temp<Integer>(10 , 20 ) ; // without diamond operator
		Temp<String> t2 = new Temp<>("hello","hi") ;  // with diamond operator
        
         // t1 = t2 ;   - >  this cannot be done , as field type do not match

		Temp<Emp> t3 = new Temp<>(new Emp() , new Emp()) ;  // a class can also be passed to generics

		t1.show() ;
		t2.show() ;
		t3.show() ;
	}
}

class Emp{
	int salary ;
    Emp(){
    	this.salary = 6000 ;
    }
}