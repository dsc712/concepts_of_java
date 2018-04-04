class Temp
{
  Temp()
   {
     System.out.println("default");
    }
  Temp(int x)
   {
    this(); 
    System.out.println("from 1 parameter constructor");

   }   
 Temp(int x,int y)
   {
    this(10);
    System.out.println("from 2 parameters constructor");
 
   }   
Temp(int x,int y,int z)
   {
      this(10,20);
      System.out.println("from 3 parameter constructor");
 
   }   
   public static void main(String... args)
    {
       Temp t=new Temp(10,20,30);
        System.out.println("from main");
   }
}