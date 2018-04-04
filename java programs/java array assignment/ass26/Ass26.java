class Ass26
{
 static void printDiagonalWise( int x[][] )
 {
   int i,col,row ;
 /*_________________________________________________________________*/
   for( i=0 ; i<x[0].length ; i++ )   
    {
      row=0;
      col=i;
       while( col!=-1 )
       {
         System.out.print("  " + x[row][col]);
         row++;
         col-- ;
         }
       System.out.println();

      }
  /*_________________________________________________________________*/

   for( i=1 ; i<x[0].length ; i++ )
    {
      col=4 ;
      row = i;
      while( row < x[0].length )
      {
        System.out.print("  " + x[row][col]);
        row++ ;
        col-- ;
       }
       System.out.println() ;
     }
 /*___________________________________________________________________*/

   }

 public static void main( String... s )
 {
   printDiagonalWise( new int[][]{ {1,2,3,4,5} , {6,7,8,9,10} , {11,12,13,14,15} , {16,17,18,19,20} , {21,22,23,24,25} } ) ;
   
  }
}