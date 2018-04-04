class Ass3
{
  static int max1(int x[][])
   {
     int max=x[0][0];
     int i,j;
      for(i=0;i<x.length;i++)
       {
         for(j=0;j<x[i].length;j++)
           {
             if(x[i][j]>max)
              {
            
                 max=x[i][j];
         
                }   
            }
         }
   return max;
    }

public static void main(String... args)
{
  int maximum;
  maximum=max1(new int[][]{ {1,3,5},  {2,7,8,6},  {3,5,9,10}  });
  System.out.println(maximum);
}

}