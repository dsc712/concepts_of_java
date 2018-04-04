interface My
{
void show();
}
class Outer
{
 int x=10;
 static int y=20;

public static void main(String... args)
{
  Outer o=new Outer();
  My m= new My()
        {
         public void show()
          {
         
            System.out.println("from anonymous");

             }
           };
   m.show();
}
}