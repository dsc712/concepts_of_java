class Ass5
{
 static void sort(int x[])
  {
    int i,j,count,temp;
 
         /*BUBBLE SORT IS USED BELOW FOR SORTING*/

     for(i=0;i<x.length-1;i++)   // n-1 passes
      {
        count=0;
        for(j=0;j<x.length-1-i;j++)
         {
            if(x[j]>x[j+1])
             {
               temp=x[j];
               x[j]=x[j+1];
               x[j+1]=temp;
               count++;
              }
         }   
          if(count==0)
            break; 
        }
      for(i=0;i<x.length;i++)
        {
           System.out.print("  "+ x[i]);
            }
   }

 public static void main(String... args)
  {
    sort(new int[]{3,5,1,8,6,9,4});
      
    }
}