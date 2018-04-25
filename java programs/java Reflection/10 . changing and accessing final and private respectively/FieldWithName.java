import java.lang.reflect.Field ;
public class FieldWithName{
	public static void main(String[] args) throws Exception{

	  Class cls = Temp.class ;
	  Temp t = new Temp() ;
	  //  t.x = 13 ;   // will throw error as x is private and final 
	  Field field = cls.getDeclaredField("x") ;   // any declared field can be catched through this method

	  field.setAccessible(true) ;  // now we can access the private field 
	  System.out.println(field) ;

	  field.set(t , 40 ) ;        // using this method we can even change the final 
	  System.out.println( field.get(t) ) ;	

	}
}

class Temp {
	private final int x = 1000 ;
}


/*
  The NoSuchFieldException would be thrown if you asked for a field by a name which did 
  not correspond to a declared field.

  The IllegalAccessException would be thrown if the field was not accessible (for example,
  if it is private and has not been made accessible via missing out the f.setAccessible(true) line.
  
*/