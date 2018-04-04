class Ass1
{
  static int max(int x[])
   {
     int max=x[0];
     int i;
      for(i=0;i<x.length;i++)
       {
         if(x[i]>max)   
          {
            max = x[i];
            }
          
          }
      return max;
     }
  public static void main(String... args)
   {
     int maximum;
     maximum=max(new int[]{2,6,4,1,8,9}) ;    
     System.out.println(maximum);
     }
}