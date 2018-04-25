/*
   finding all fields of a class ( only public fields )
*/

import java.lang.reflect.* ;
import java.awt.* ;

class SampleField {

	public static void  printFields( Object o ){
		Class c = o.getClass() ;
		Field f[] = c.getFields() ;

	    for(int i = 0 ; i < f.length ; i++ ){
	        Class type = f[i].getType() ;
	        System.out.print(type.getName() + " ") ;
	        System.out.println( f[i].getName() ) ;
	    }
	  }  

    public static void main(String[] args) {
    	//Color c = new Color(1 , 1, 1 ) ;
    	Temp c = new Temp() ;
    	printFields(c) ;
    }
}

class Temp {
	public int x ;
	public byte b ; 
	public long l ; 
	public short s ;
	public boolean b1 ;
	public double d ;
	public char ch ;
	float f ;   // not public 
}