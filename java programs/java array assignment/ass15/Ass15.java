class Ass15
{

 static void triangleAmax( int x[][] )
  {
    int i,j,max=x[0][0] ; 
    for( i=0 ; i<x.length ; i++ )
     {
       for( j=i ; j<x[i].length ; j++)
         { 
            if( x[i][j] > max )
              max = x[i][j] ;
         }
     }
    System.out.println("\nmaximum value of element in upper triangle of the given matrix is " + max);
   }
 public static void main(String... args)
 {
   triangleAmax( new int[][]{ {1,2,3} , {4,5,6} , {7,8,9} } ) ;
 
   }
}