class Ass31
{

 static void median( int x[] )
  {
    float Median;
   
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
     
   if( x.length % 2 == 0)
     {
        Median = (float)( x[ (x.length/2) - 1 ] + ( x[ ( x.length/2 + 1) - 1 ]) ) / 2 ;
        
        }
    else
      {
        Median =  x[ ( ( x.length + 1 ) / 2 ) - 1] ;
         
        }
    System.out.println("median of the given array elements is "+ Median );
    
    }

 public static void main(String... args)
  { 
    
    median( new int[]{7,6,2,9,8,4,3,4,6} );
     
     }
}