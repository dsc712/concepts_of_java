class Base
{
  Base show()
   {
     System.out.println("base class function is called");
     return new Base();
    }
}
class Child extends Base
{
  Child show()
   {
    
    System.out.println("child class function is called"); 
    return new Child();
    }
 
   public static void main(String... args)
    {
     Child c1=new Child();
      c1.show();           //child class show() will be called
     Base b1=new Base();
      b1.show();           //base class show() will be called
     }
}