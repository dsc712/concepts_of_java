class Ass17
{
 static void triangleBsum( int x[][] )
  {
    int i,j,sum=0 ;
    
    for( i=0 ; i<x.length ; i++ )
     {
       for( j=0 ; j<=i ; j++ )
        {
          sum += x[i][j] ;
          }
       } 
     
     System.out.println("\nsum of all the elements of the given lower triangular matrix is " + sum);
   }

 public static void main(String... args)
 {
   triangleBsum( new int[][]{ {1,2,3} , {4,5,6} , {7,8,9} } ) ;
 
   }
}