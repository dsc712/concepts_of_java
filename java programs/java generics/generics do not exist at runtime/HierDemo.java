class  Gen<T>{
	T ob ;
	Gen(T o){
		ob = o ;
	}

	// return ob 
	T getob(){
		return ob ;
	}
}

// A subclass of Gen 
class Gen2<T> extends Gen<T>{
	Gen2(T o){
		super(o) ;
	}
}
//Demonstrate runtime type id implications of generic class

class HierDemo{
	public static void main(String[] args) {
		//create a Gen object for Integer
		Gen<Integer> iob = new Gen<Integer>(88) ;
		//create a Gen2 object for integers
		Gen2<Integer> iob2 = new Gen2<>(44) ;
		// create a Gen2 objct for String
		Gen2<String> strOb2 = new Gen2<>("Generics Test") ;

		if( iob2 instanceof Gen2<?> ){
			System.out.println("iob2 is a instance of Gen2") ;
		}
		if (iob2 instanceof Gen<?> ) {
			System.out.println("iob2 is instance of Gen") ;
		}
		if (strOb2 instanceof Gen2<?> ) {
			System.out.println("strOb2 is instance of Gen2") ;
		}
		if (strOb2 instanceof Gen<?>) {
			System.out.println("strOb2 is instance of Gen") ;
		}

		// See if iob is an instance of Gen2 , which it is not
		 if(iob instanceof Gen2<?>){
		 	System.out.println("iob is instance of Gen2") ;
		 }

		// See if iob is intance of Gen , which it is
		 if(iob instanceof Gen<?>){
		 	System.out.println("iob is instance of Gen") ;
		 }


        // The following can't be compiled , because Generic type does not exist at runtime
		 // if(iob2 instanceOf Gen2<Integer>){
		 // 	System.out.println("iob2 is instance of Gen2") ;
		 // }
	}
}


/*

The problem is that generics was not always present in java , it was added in jdk 1.5 . 
So in order to be able to achieve backwards compatibility there is 'type erasure' which effectively
erases generic type information while compiling your code in order to achieve that goal.


Generics were introduced to the Java language to provide tighter type checks at compile time
and to support generic programming. To implement generics, the Java compiler applies 'type erasure' to:

1 . Replace all type parameters in generic types with their bounds or Object if the type parameters are unbounded.
    The produced bytecode, therefore, contains only ordinary classes, interfaces, and methods.
2.  Insert type casts if necessary to preserve type safety.
3.  Generate bridge methods to preserve polymorphism in extended generic types.
4.  Type erasure ensures that no new classes are created for parameterized types; consequently, generics incur no runtime overhead.


*/