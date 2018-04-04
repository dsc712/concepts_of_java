interface My
{
  void show(); 
 
}
class Outer
{
 int x=10;  
 static int y=20;
 My display()
  {
    class Inner implements My
     {
       public void show()
        {
          System.out.println(x);
          System.out.println(y);
          }
      
       }
   My M=new Inner();
       return M;   // RID is returned so that this class can be used outside display function
  }
  public static void main(String... args)
   {
    Outer o=new Outer();
    My z=o.display();
    z.show();  //here local class is used outside the block in which it was defined
    }
}