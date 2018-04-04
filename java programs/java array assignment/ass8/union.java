class Union
{
static void union(int x[],int y[])
{
  int z[]=new int[x.length + y.length];
  int i,j,temp,count,zlen=x.length;
 
  for(i=0;i<x.length;i++)  //storing all the contents of array x in union array
   {
     z[i]=x[i];
     }

   for(i=0;i<y.length;i++)  // for traversing all the elements of y
    {
      count=0;
      temp=y[i];
       for(j=0;j<x.length;j++)  // loop for traversing all the elements of x stored in z
        {
          if(temp==z[j])  // checking for the repetetion of any element of y in x
           {
             count++;
             break;
               }
          }
         if(count==0)  //the given y's element was not present in x
          {
            z[zlen]=temp;
            zlen++;
            }
      }

   for(i=0;i<zlen;i++)  //for printing the union of two arrays
    {
      System.out.print("  "+z[i]); 
        
      }

}

public static void main(String... args)
{
  union(new int[]{2,5,8,9,4,6},new int[]{4,8,9,3,6,5,1});
 
}

}