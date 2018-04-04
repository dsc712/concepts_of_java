class GenMethodDemo {

  // determine if an object is present in an array or not
    static  <T , V extends T> boolean  isIn(T x , V[] y ){    // < t , v > should be written in b/w modifiers and return type of methods
  	for (int i=0 ; i<y.length ; i++) {
  		if(x.equals(y[i])){
  			return true ;
  		}
  	}
  	 return false ;
  }

  static <T extends Number > double add(T x , T y){
  	double d = x.doubleValue() ;
  	return d ;
   }
   public static void main(String[] args) {
   	 
   	 // use isIn() on Integer
   	   Integer nums[] = {1 , 2 , 3 , 4 , 5} ;
       if(isIn(2 , nums)){
       	 System.out.println("2 is in nums") ;
       }
       if (!isIn(7 , nums)) {
       	 System.out.println(" 7 not in nums ") ;
       }

     // use isIn() on Strings
       String strs[] = {"one" , "two" , "three" , "four" , "five"} ;

       if(isIn("two" , strs)){
       	 System.out.println("two is in strs") ;
       }
       if(!isIn("seven" , strs)){
       	 System.out.println("seven is not in Strings. ") ;
       }

       System.out.println( add(10 , 20) ) ;
       System.out.println( add(10.5f , 20.5f )) ;
       System.out.println( add(10.5 , 20.5)) ;
       System.out.println( add(100L , 200L)) ;

   }
}