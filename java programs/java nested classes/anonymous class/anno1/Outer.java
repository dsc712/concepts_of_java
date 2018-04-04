interface my
{
  void show();
}

class Outer 
{

  int x=10;
  static int y=20;
  
  my display()
   {
      return ( new my()
                {
                  public void show()  
                   {
                     System.out.println(x);
                     System.out.println(y);
                      }
                   }
                  );
     
    }
 
public static void main(String... args)
 {
   Outer o=new Outer();
   my m=o.display();
   m.show();
    }
}