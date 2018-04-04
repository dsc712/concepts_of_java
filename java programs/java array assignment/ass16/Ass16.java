class Ass16
{

 static void triangleAmin( int x[][] )
  {
    int i,j,min=x[0][0] ; 
    for( i=0 ; i<x.length ; i++ )
     {
       for( j=i ; j<x[i].length ; j++)
         { 
            if( x[i][j] < min )
              min = x[i][j] ;
         }
     }
    System.out.println("\nminimum value of element in upper triangle of the given matrix is " + min);
   }
 public static void main(String... args)
 {
   triangleAmin( new int[][]{ {1,2,3} , {4,5,6} , {7,8,9} } ) ;
 
   }
}