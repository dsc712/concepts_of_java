class Ass27
{
 static void printSequenceDiagonalWise( int x[][] )
 {
   int i,col,row ;
 /*_________________________________________________________________*/
   for( i=0 ; i<x[0].length ; i = i+2 )   
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
              
       row = i+1 ;
       col = 0 ;

       while( row != -1 && row <= 4 )
        {
          System.out.print("  " + x[row][col] ) ;
          row -- ;
          col ++ ;
          }
        System.out.println() ;

      }
  /*_________________________________________________________________*/
   
   for( i=1 ; i<x[0].length ; i = i+2 )
    {
      row = x.length - 1;
      col = i ;
      
      while( col < x[0].length )
       {
         System.out.print("  " + x[row][col] ) ;
         col ++;
         row --;
         }
      System.out.println() ;       

       row = i+1 ;
       col = x[0].length -1 ;
       
       while( row < x[0].length )
        {
          System.out.print("  " + x[row][col] ) ;
          col -- ;
          row ++ ; 
          }
       System.out.println() ;
     }


 /*___________________________________________________________________*/

 }

 public static void main( String... s )
 {
   printSequenceDiagonalWise( new int[][]{ {1,2,3,4,5} , {6,7,8,9,10} , {11,12,13,14,15} , {16,17,18,19,20} , {21,22,23,24,25} } ) ;
   
  }
}