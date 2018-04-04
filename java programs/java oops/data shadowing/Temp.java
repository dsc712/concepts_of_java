class Temp
{
  int x=20;
  
  void show(int x)
   {
     System.out.println(this.x);// in case of data shadowing explicitly add this keyword with.
     System.out.println(x);//without this. it will print local variable 10
     
    }
  public static void main(String... args)
   {
      Temp t=new Temp();
       System.out.println(t);
       t.show(10);
       
   }
}