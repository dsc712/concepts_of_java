class Ass4
{
  static int min1(int x[][])
   {
     int min=x[0][0];
     int i,j;
      for(i=0;i<x.length;i++)
       {
         for(j=0;j<x[i].length;j++)
           {
             if(x[i][j]<min)
              {
                 min=x[i][j];
                }   
            }
         }
   return min;
    }

public static void main(String... args)
{
  int minimum;
  minimum=min1(new int[][]{ {1,3,5},  {2,7,8,6},  {3,5,9,10}  });
  System.out.println(minimum);
}

}