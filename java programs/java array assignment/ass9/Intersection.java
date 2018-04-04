class Intersection
{
   static void intersection(int x[],int y[])
    {
      int i,j,zlen=0;
      int z[]=new int[x.length+y.length];
       for(i=0;i<x.length;i++)
        {
          for(j=0;j<y.length;j++)
           {
             if(x[i]==y[j])
              {
                z[zlen]=x[i];
                zlen++;  
                }
             } 
          } 

     for(i=0;i<zlen;i++)
      {
        System.out.print("  "+z[i]);
        }
      }

  public static void main(String... args)
   {
     intersection(new int[]{3,5,8,2,6},new int[]{4,8,9,2});
    } 
}