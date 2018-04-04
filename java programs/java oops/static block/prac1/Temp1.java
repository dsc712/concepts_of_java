class Temp
{
 static int x ;
  
 static
 {
    try
      {
        x=System.in.read();
       }
    catch(Exception e)
      {
        System.out.println(e) ;
       }
  }
}
class Temp1
{
  public static void main( String... args )
   {
      System.out.println(Temp.x) ;
      System.out.println(Temp.x) ; //to show that static block is executed only once
    }
}