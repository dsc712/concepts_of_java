public class IsInterface{
	public static void main(String[] args) throws Exception {
		Class clazz = int.class ;
		Class ar = int[].class ;
		Class c = java.io.Serializable.class ;
		boolean IsPrimitive = clazz.isPrimitive() ;  // true
		boolean IsInterface = c.isInterface() ;  // true 
		boolean IsArray = ar.isArray() ;  // true 

        // printing out the results
        System.out.println("is primitive ? " + IsPrimitive ) ;
        System.out.println("is array ? " + IsArray ) ;
        System.out.println("is interface ? " + IsInterface ) ;
   	}
}