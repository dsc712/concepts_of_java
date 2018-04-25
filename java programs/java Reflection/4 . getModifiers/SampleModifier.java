// The java.lang.Class.getModifiers() returns the Java language modifiers for this class or interface, 
// encoded in an integer. The modifiers consist of the Java Virtual Machine's constants for
// public, protected, private, final, static, abstract and interface; they should be decoded
//  using the methods of class Modifier.

import java.lang.reflect.* ;
import java.awt.* ;
class SampleModifier {
	public static void printModifier(Object o) throws Exception {
		 Class c = o.getClass() ;
		//Class c = Class.forName("java.awt.Graphics") ;
		int m = c.getModifiers() ;

		// m is an encoded integer which can be passed in different different Modifier's 
		// class static methods to check about different modifiers
		if(Modifier.isPublic(m)){
			System.out.println("public") ;
		}
		if(Modifier.isFinal(m)){
			System.out.println("final") ;
		}
		if(Modifier.isAbstract(m)){
			System.out.println("abstract") ;
		}

	}
	public static void main(String[] args) throws Exception {


		String a = new String("aaa") ;
		printModifier(a) ;
		

	}
}