class NonGen{
	int num ;
	NonGen(int i){
		num = i ; 
 	}
 	int getNum(){
 		return num ;
 	}
}

// A generic subclass
class Gen<T> extends NonGen{
	T ob ;

	Gen(T o , int i){
		super(i) ;
		ob = o ;
	}

	  T getOb()
		{
           return ob ;
		}
}
class Temp{
	public static void main(String[] args) {
		// create a Gen object for string
		Gen<String> w = new Gen<>("Hello" , 47) ;
		System.out.println(w.getOb() + " ") ;
		System.out.println(w.getNum()) ;
	}
}