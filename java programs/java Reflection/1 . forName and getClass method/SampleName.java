import java.lang.reflect.* ;
import java.awt.* ; 

public class SampleName{
	public static void printName(Object o ){
		Class c = o.getClass() ;
		System.out.println(c.getName()) ;
	}
	public static void printName(String s){
		try{
			Class c = Class.forName(s) ;
			System.out.println(c.getName()) ;
			StringBuffer sb = (StringBuffer)c.newInstance() ;
			System.out.println(sb.length()) ;
			System.out.println(sb.capacity()) ;
		}catch(Exception e ){
			System.out.println(e) ;
		}
	}
	public static void printName1(String s){
		try{
			Class c = Class.forName(s) ;
			System.out.println(c.getName()) ;
			Temp sb = (Temp)c.newInstance() ;
			sb.show() ;
		}catch(Exception e){
			System.out.println(e) ;
		}
	}
	public static void main(String[] args) {
		Button b = new Button("hh") ;
		printName(b) ;
		printName("java.lang.StringBuffer") ;
		// printName("java.awt.Frame") ;
		printName1("Temp") ;
		Class c = java.lang.Thread.class ;
		System.out.println(c.getName()) ;
	}
}

class Temp{
	Temp(){
		System.out.println("default constructor") ;
	}
	void show(){
		System.out.println("creation of object via reflection ") ;
	}
}



/*

-> One object of class Class is created as a reflected image of another class.
-> Whenever any class is loaded into memory then one class Class object is created 
   for that class by the jvm .
   
*/