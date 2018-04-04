class Ass11
{
 static void matrixMul(int x[][],int y[][])
  {
    int z[][] = new int[3][3];
    int i,j,k;

/*_________________________________________________________________________________*/
  /*     MULTIPLICATION    LOGIC              */

 /*________________________________________________________________________________*/
     for( i=0 ; i < x.length ; i++ )
      {
        for( j=0 ; j < y[i].length ; j++ ) 
          {
             z[i][j]=0;
              
               for(k=0;k<x[i].length;k++)
                {
                   z[i][j] += x[i][k] * y[k][j] ;
                  
                  } 
            }
          
         }

/*__________________________________________________________________________________*/

     /*       PRINTING THE RESULTANT MATRIX AFTER MULTIPLICATION             */
/*___________________________________________________________________________________*/
      
      for( i=0 ; i<z.length ; i++ )
       {
          for( j=0 ; j<z[i].length ; j++)
             {
                System.out.print(z[i][j] + "  ");
               
               }
               System.out.println();
           }
   }
 public static void main(String... args)
  {
    matrixMul(new int[][]{ {1,2,3} , {4,5,6}, {7,8,9} } ,new int[][]{ {7,8,9} , {4,5,6} , {1,2,3} } );
    
     }
}