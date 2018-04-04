class Outer
{
  int x=10;
  static int y=20;
  
  class Inner
  {
    int x=40;
      void show()     
       {
         System.out.println(x);  // Data Shadowing
         System.out.println(y);
         System.out.println(Outer.this.x); // AJAB GAJAB
         }
   }
 public static void main(String... args)
  {
    Outer o=new Outer();  // for using a non static data member of a class we need to create instance of that class first
    
    Inner i=o.new Inner(); // since inner class is also a non-static data member of outer class ,so it can be accessed only by RID.
    
    i.show();
   }
}