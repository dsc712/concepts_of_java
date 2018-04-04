class Ass19
{
 static void triangleBmin( int x[][] )
  {
    int i,j,min=x[0][0] ;
    
    for( i=0 ; i<x.length ; i++ )
     {
       for( j=0 ; j<=i ; j++ )
        {
          if( x[i][j] < min)
             min = x[i][j] ;
          }
       } 
     
     System.out.println("\n value of minimum element of the given lower triangular matrix is " + min);
   }

 public static void main(String... args)
 {
   triangleBmin( new int[][]{ {1,2,3} , {4,5,6} , {7,8,9} } ) ;
 
   }
}