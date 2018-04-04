class Ass18
{
 static void triangleBmax( int x[][] )
  {
    int i,j,max=x[0][0] ;
    
    for( i=0 ; i<x.length ; i++ )
     {
       for( j=0 ; j<=i ; j++ )
        {
          if( x[i][j] > max)
             max = x[i][j] ;
          }
       } 
     
     System.out.println("\n value of maximum element of the given lower triangular matrix is " + max);
   }

 public static void main(String... args)
 {
   triangleBmax( new int[][]{ {1,2,3} , {4,5,6} , {7,8,9} } ) ;
 
   }
}