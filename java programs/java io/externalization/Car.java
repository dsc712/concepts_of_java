import java.io.* ;

public class Car implements Externalizable
{
 static int age ;
 String name ;
 int year ;
  
 //mandatory default constructor
 
 public Car()
 {
   System.out.println("default constructor") ; 
 }
 
 public Car(String n , int y)
 {
   name = n ;
   year = y ;
   age = 10 ;
  }

 //mandatory writeExternal method
 
 public void writeExternal(ObjectOutput out ) throws IOException
 {
   System.out.println("writeExternal method") ;
   out.writeObject(name) ;
   out.writeInt(year);
   out.writeInt(age) ; 
  }
 
 //mandatory readExternal method
 
 public void readExternal(ObjectInput in) throws ClassNotFoundException , IOException
 {
   System.out.println("readExternal method") ; 
   name = (String)in.readObject() ;
   year = in.readInt() ;
   age = in.readInt() ;
 }

 public String toString()
 {
   return ("name : " + name + "\n" + "year : " + year + "\n" + "age = " + age) ; 
 }
}