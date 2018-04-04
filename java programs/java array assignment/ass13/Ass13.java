class Ass13
{
 static void matrixSum( int x[][] )
  {
    int y[] = new int[5] ;
    int i , j , sum ,sumA=0 , sumB=0 ;



  /*_________________________________________________________*/  




    for( i=0 ; i < x.length ; i++ )
     {
       for( j=0 ; j < x[i].length ; j++ )
         {
           System.out.print("  " + x[i][j]);
           } 
         System.out.println();
      }
        System.out.println("\n\n\n matrix sum of the above given matrix is \n");



 /*_________________________________________________________*/   
   
  for( i=0 ; i < x.length ; i++ )
     {
       sum=0 ;    
       for( j=0 ; j < x[i].length ; j++ )
         {
           if(i == j)
            {
              sumA += x[i][j] ;
              }

           if( ( i==0 && j==2) || (i==2 && j==0 ) || (i==1 && j==1) )
            {
              sumB += x[i][j] ; 
              }

           sum += x[i][j] ;

           System.out.print("    " + x[i][j]);
           } 
         System.out.println("    " + sum +"\n");
       }
    
 /*____________________________________________________________*/
     
     for( i=0 ; i < x.length ; i++ )
      {
        sum = 0;
        for( j=0 ; j < x.length ; j++ )
         {
            sum += x[j][i]  ;
           }
         y[i+1] = sum ;
       }

       y[0] = sumB ;
       y[4] = sumA ;
 /*____________________________________________________________*/

    

 
      for( i=0 ; i < y.length ; i++ )
       {
          System.out.print(y[i] + "   ");
   
         }
} 



  public static void main(String... args)
  {
     matrixSum( new int[][]{ {1,2,3} , {4,5,6} , {7,8,9} } );

   }
}