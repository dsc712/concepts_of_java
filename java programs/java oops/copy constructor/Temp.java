class Temp
{
  int x;
  int y;
Temp(int x,int y)
{
  this.x=x;
  this.y=y;
}
Temp(Temp z)   //copy constructor
{
  this.x=z.x; 
  this.y=z.y;
}  

void show()
{
  System.out.println("x=" + x);
   System.out.println("y=" + y);
}

   public static void main(String... args)
    {
      Temp t1=new Temp(100,200);
       t1.show();
      Temp t2=new Temp(t1);
        t2.show();
     }

}
