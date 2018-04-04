class Ass2
{
  static int min(int x[])
   {
     int min=x[0];
     int i;
      for(i=0;i<x.length;i++)
       {
         if(x[i]<min)
          {
            min=x[i];  
            }
          
          }
      return min;
     }
  public static void main(String... args)
   {
     int minimum;
     minimum=min(new int[]{2,6,4,1,8,9}) ;    
     System.out.println(minimum);
     }
}