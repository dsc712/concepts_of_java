import java.lang.reflect.* ;
import java.awt.* ;
class SampleConstructor {
  public static void printConstructor(Object o ){
  	Class c = o.getClass() ;
  	Constructor cs[] = c.getConstructors() ;   // it gets all the constructors of the class in an array of constructors

  	for (int i = 0 ; i < cs.length   ; i++  ) {

  	 	 System.out.print( c.getName() + " ( ") ;

         Class type[] = cs[i].getParameterTypes() ; // it gets the datatype of parameters present in constructor 

         for (int k = 0 ; k < type.length  ; k++ ) {
         	if( k == type.length - 1){
         		System.out.print( type[k].getName() ) ;
         	}else{
         		System.out.print( type[k].getName() + " , ") ;
         	}	
         }

         System.out.println(" ) ") ;
  	 } 
  }

  public static void main(String[] args) {

  	// Thread t = new Thread("ss") ;
     String s1 = new String("hh") ;
  	printConstructor(s1) ;

  }
}