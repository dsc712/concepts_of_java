/*

  Only the object of those classes can be cloned which are implementing cloneable interface .
  It is a marker interface i.e it's purpose is just to specify whether a class can be cloned or
  not , it does not provide any abstract method . In order for clone() method to work properly, 
  two things need to happen, a class should implement Cloneable interface and should override 
  clone() method of Object class.

*/
class Temp {
	int g ;
	Temp(int g){
		this.g = g ;
	}
}

class MyClone implements Cloneable{
	int x = 10 ;
	Temp t ;
	MyClone(int a){
		t = new Temp(a) ;
	}

	public MyClone clone(){
       
       // shallow copy 
		try{
			return (MyClone)super.clone() ;
		}catch(CloneNotSupportedException e){
			return null ;
		}
	}
	public static void main(String[] args) {
		MyClone c = null ;
		MyClone m = new MyClone(100) ;
		System.out.println("m.t.g" + m.t.g );
		System.out.println("m.x" + m.x) ;

		try
		{
			c = m.clone() ;
		}catch(Exception e){
			System.out.println(e) ;
		}
        
        System.out.println( "c" + c.t.g );
        System.out.println("c.x" + c.x ) ;
         
        c.t.g = 300 ;
        c.x = 30 ;

        System.out.println(" m after changes " + m.t.g ) ;  // since it's a primitive inside of mutable object , it will change 
        System.out.println("m after changes " + m.x) ;  // it will not be changed by change in clone as it is primitive and it's not shared

        if( m.t == c.t ){
        	System.out.println("shallow cloning") ;
        }
	}
}


/*

 
Things to Remember - Clone() method in Java

1) The clone() method is used to create a copy of an object in Java. In order to use clone() method, class must 
   implement java.lang.Cloneable interface and override protected clone() method from java.lang.Object.
   A call to clone() method will result in CloneNotSupportedException if that class doesn't implement Cloneable interface.


2) No constructor is called during cloning of Object in Java.


3) Default implementation of clone() method in Java provides "shallow copy" of object, because it creates copy of 
   Object by creating new instance and then copying content by assignment, which means if your class contains a
   mutable field, then both original object and clone will refer to same internal object. This can be dangerous 
   because any change made on that mutable field will reflect in both original and copy object. In order to avoid
   this, override clone() method to provide the deep copy of an object.


4) By convention, clone of an instance should be obtained by calling super.clone() method, this will help to preserve
   invariant of object created by clone() method i.e. clone != original and clone.getClass() == original.getClass(). 
   Though these are not absolute requirement as mentioned in Javadoc.


5) A shallow copy of an instance is fine, until it only contains primitives and Immutable objects, otherwise, you 
   need to modify one or more mutable fields of object returned by super.clone(), before returning it to caller.


*/