import java.io.* ;

public class ExternExample
{

 public static void main(String... args) 
 {
   Car car = new Car("mitsbushi" , 2009) ;
  
 // serialize the car

   try{
     FileOutputStream fo = new FileOutputStream("temp") ;
     ObjectOutputStream so = new ObjectOutputStream(fo) ;
   
     so.writeObject(car);
     so.flush() ;
      } 
   catch(Exception e) 
   {
    System.out.println(e) ;  
   }

 // deserialize the car
  
  try{
     FileInputStream fi = new FileInputStream("temp") ;
     ObjectInputStream si = new ObjectInputStream(fi) ;
     Car newCar = (Car)si.readObject() ;
     System.out.println("the original car is") ;
     System.out.println(car) ;
     System.out.println("the new car is") ;
     System.out.println(newCar) ;    
     }
    catch(Exception e)
    {
     System.out.println(e) ;  
    }

 }

}