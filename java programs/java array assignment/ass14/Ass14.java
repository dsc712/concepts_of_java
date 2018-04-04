class Ass14
{

 static void triangleAsum( int x[][] )
  {
    int i,j,sum=0 ; 
    for( i=0 ; i<x.length ; i++ )
     {
       for( j=i ; j<x[i].length ; j++)
         { 
            sum += x[i][j] ;
         }
     }
    System.out.println("\nSum of all the elements of upper triangle in the given matrix is " + sum);
   }
 public static void main(String... args)
 {
   triangleAsum( new int[][]{ {1,2,3} , {4,5,6} , {7,8,9} } ) ;
 
   }
}