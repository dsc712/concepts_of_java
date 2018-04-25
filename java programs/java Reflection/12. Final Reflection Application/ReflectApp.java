/*
   This is a very simple console based app , to run it in console you need to write : 
   java ReflectApp "some class with full package name "

   for e.g
   java ReflectApp "java.lang.String"
  
   and in result all the fields , constructors , methods will be displayed about that class 
*/

import java.lang.reflect.* ;

public class ReflectApp {
	public static void main(String[] args) {
		String param = args[0] ;
		Class className = null ;
		try{
			className = Class.forName(param) ;
		}catch(ClassNotFoundException e){
            System.out.println("Not a class or interfacce" ) ;
            System.exit(0) ;
		}
		describeClassOrInterface(className , param ) ;
	}

	static void describeClassOrInterface(Class className , String name ){
		displayModifiers(className.getModifiers()) ;
		System.out.println("") ;
		displayFields(className.getDeclaredFields() ) ;
		System.out.println("") ;
		displayMethods(className.getDeclaredMethods() ) ;
		System.out.println("") ;

		if(className.isInterface()){
			System.out.println("interface : " + name ) ;
		}else{
			System.out.println("class : " + name ) ;
			displayInterfaces(className.getInterfaces() ) ;
			displayConstructors(className.getDeclaredConstructors() ) ;
		}
	}

	static void displayModifiers(int m){
		System.out.println("Modifiers : "  + Modifier.toString(m)) ;
	}
	static void displayInterfaces(Class[] interfaces){
		if(interfaces.length > 0 ){
			System.out.println("interfaces .... ") ;

			for(int i = 0 ; i<interfaces.length ; i++ ){
				System.out.println(interfaces[i].getName()) ;
			}
		}

	}
	static void displayFields(Field[] fields){
		if(fields.length > 0){
			System.out.println("Fields .... ") ;

			for (int i = 0 ; i < fields.length  ; i++  ) {
				System.out.println(fields[i].toString()) ;
			}
		}
	}
    
    static void displayConstructors(Constructor[] constructors){
       if(constructors.length > 0){
			System.out.println("Constructors .... ") ;

			for (int i = 0 ; i < constructors.length  ; i++  ) {
				System.out.println(constructors[i].toString()) ;
			}
		}
    }
	static void displayMethods(Method[] methods){
		if(methods.length > 0){
			System.out.println("Methods .... ") ;

			for (int i = 0 ; i < methods.length  ; i++  ) {
				System.out.println(methods[i].toString()) ;
			}
		}
	}

}