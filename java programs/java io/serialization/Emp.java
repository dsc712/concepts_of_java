import java.io.* ;

public class Emp extends Base implements Serializable
{
 private static final long serialVersionUID = 1L ;
 
 transient int a  ;
 static int b = 5 ;
 String name ;
 int age ;
 int salary ;
 
  public Emp(String name , int age , int a , int b , int z)
 {
  this.name = name ;
  this.age = age ;
  this.a = a ;
  this.b = b ;
  this.z = z ;
 }
 
}
