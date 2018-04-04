import static java.lang.System.*;
class Outer
{
  int x=10;
  static int y=10;
   static class Inner extends Outer
    {
      void show()
        {
          out.println(x);
          out.println(y);
          out.println("from non static method");
          }
      static void show1()
        {
          out.println(y); 
          out.println("from static function");
          }
     }
  public static void main(String... args)
   {
     
     Inner.show1();  // for static functions there is no need to create object of inner class

     Inner i=new Inner();  // object of inner class is made to use non static functions present inside inner static class

     i.show();
     }
}