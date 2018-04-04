class Ass7
{
static void mergeSort(int x[] , int y[])
{
  int z[]=new int[ x.length + y.length ] ;
  int i,j,k=0;
  
   for( i=0 , j=0 ; k<( x.length + y.length ) ; )
     {
       if( i<x.length && j<y.length && x[i] > y[j] )
        {
          
            z[k++] = y[j++]; 

           }
       else if( i<x.length && j<y.length && x[i] < y[j])
          {
            z[k++] = x[i++];
             
            }
       else if( i<x.length && j<y.length && x[i] == y[j])
          {
            z[k++] = x[i++];
            z[k++] = y[j++];
            }
       else if( i>=x.length && j<y.length)
           {
             z[k++] = y[j++];
             
            }
       else
           {
             z[k++] = x[i++];
               
             }
        }

   for( i=0 ; i < z.length ; i++)
     {
        System.out.print("  " + z[i]); 
        }    
} 

public static void main(String... args)
{
  mergeSort(new int[]{ 2,4,6,8,10 } ,new int[]{ 1,3,5,7,9 });

}

}