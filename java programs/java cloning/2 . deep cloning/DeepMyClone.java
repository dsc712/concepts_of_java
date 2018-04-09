/*
 Since Object class' clone() method creates copy by creating new instance,
 and then copying field-by-field, similar to assignment operator, it's fine
 for primitives and Immutable object, but not suited if your class contains
 some mutable data structure e.g. Collection classes like ArrayList or arrays.
 In that case, both original object and copy of the object will point to the 
 same object in the heap. You can prevent this by using the technique known 
 as deep cloning, on which each mutable field is cloned separately.


*/

   class Temp implements Cloneable{
   	int g ;
   	Temp(int g){
   		this.g = g ;
   	}
   	public Temp clone(){
   		try{
   			return (Temp)super.clone() ;
   		}catch(Exception e){
   			return null ;
   		}

   	}
   }

   class DeepMyClone implements Cloneable {
   	 int x = 10 ;
   	 Temp t ;
   	 DeepMyClone( int a ){
   	 	t = new Temp(a) ;
   	 }
   	 public DeepMyClone clone(){
   	 	//deep copy 

   	 	try{
   	 		DeepMyClone d = (DeepMyClone)super.clone() ;
   	 		d.t = t.clone() ;
   	 		return d ;
   	 	}catch(Exception e){
   	 		return null ;
   	 	}

   	 }
   	 public static void main(String[] args) {
   	 	DeepMyClone c = null ;
   	 	DeepMyClone m = new DeepMyClone(100) ;
   	 	System.out.println("m" + m.t.g) ;
   	 	try{
   	 		c = m.clone() ;
   	 		//c.t = m.t.clone() ;
   	 	}catch(Exception e){

   	 	}
   	 	c.t.g = 300 ;
   	 	System.out.println("m after changes" + m.t.g) ;  // will not change as it is deep cloned
   	 	if(m.t != c.t){
   	 		System.out.println("deep cloning") ;
   	 	}
   	 }
   }


 /*
 Now you know how to override clone method, it's time to sharper your knowledge and learn some
 best practices related to clone() method in Java. We will also look, what things to avoid,
 because best practices will not yield any result if you don't stop following bad practices.


1) Return Sub class from clone() method, instead of returning java.lang.Object
   One shortcoming of clone() method is that it return Object, which means user 
   of clone() method must do type casting to get correct type of object. From Java 1.5 
   onwards an overriding method can return subclass of return type declared in original
   method, which means you can return sub class from clone method. It is known as
   co-variant method overriding. This will prevent lot of type casting at client side.
   Unfortunately clone() method of java.util.Date is not updated to take advantage of
   this change made in Java 5. Which means you need to cast cloned object into Date, before using it.



2) Use deep copy, if your class contains any mutable field.
   Remember to perform deep cloning before returning deep copy of object,
   if it contains any mutable field. Java documentation of clone method says that,
   you may need to modify certain fields before returning them, to make cloned object 
   completely independent from original object. For example in java.util.Date method's 
   clone method, we are explicitly cloning cdate field, as shown below.

		d = (Date)super.clone();
		if (cdate != null) {
		  d.cdate = (BaseCalendar.Date) cdate.clone();
		}

This step conflict with use of final field, had cdate would be final, you can not perform this step
, because final fields can not be reassigned once initialized.



3) Don't throw CloneNotSupportedException.
One of the most annoying thing, while using clone() method to copy object is handling of checked exception,
which is often necessary, because most of the time, client only call clone() method on object, they know 
supports cloning of objects. By catching CloneNotSupportedExcpetion internally in overridden clone() method,
you do a lot of favor to your clients. You can take a look at java.util.Date's clone() method for this example,
 which doesn't throw this exception.



 */