class Hathi
{
 static int x = 10 ;
 static 
  {
   System.out.println("static block is executed at class loading time") ;
   }
}
class Temp
{
  public static void main(String... args)
   {
     System.out.println(Hathi.x) ;
     
      }
}
