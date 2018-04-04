class Ass35
{
 static void printTriangleWise( int x[] )
 {
   int i,j ;
    
   for( i=0 ; i<x.length ; i++ )
    {
       for( j=0 ; j<=i ; j++)
        {
          System.out.print(x[j] + "  ");
         } 
        System.out.println() ;
       }
  
  } 

 public static void main(String... args)
 {
   printTriangleWise( new int[]{ 1,2,3,4,5 } );
 
 }

 }