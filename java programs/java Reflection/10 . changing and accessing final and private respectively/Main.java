import java.lang.reflect.* ;

class GetMethods {
	private double div(int numberA , int numberB ){
		return numberA/numberB ;
	} 
}

class Main{
	public static void main(String[] args) throws Exception {
		GetMethods m1 = new GetMethods() ;
		Class clazz = m1.getClass() ;

	    // Method method = clazz.getMethod("div" , new Class[]{
	    // 	int.class ,
	    // 	int.class 
	    // }) ;
	  
	      Method method  =  clazz.getDeclaredMethod("div" , int.class , int.class ) ;
	      method.setAccessible(true) ;
	      System.out.println("method name "+ method.getName() ) ;
	      Double z = (Double)method.invoke(m1 , 10 , 5 ) ;
	      System.out.println( z.doubleValue() ) ;

	   }

}

/*

	getDeclaredMethods includes all methods declared by the class itself,
	whereas getMethods returns only public methods, but also those inherited
	from a base class (here from java.lang.Object).

*/