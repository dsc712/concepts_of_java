class Ass12
{
static void matrixTranspose(int x[][])
{
  int y[][]=new int[3][3];
  int i,j;
  
  for( i=0 ; i<x.length ; i++ )
   {
     for( j=0 ; j<x[i].length ; j++)
       {
         y[j][i] = x[i][j];  
         
         }
     }
 
   for( i=0 ; i<y.length ; i++ )
    {
      for( j=0 ; j<y[i].length ; j++ )
       {
         System.out.print(y[i][j] + "  ");   
          
         }
        System.out.println();
        
      }
}

public static void main(String... args)
{
  matrixTranspose(new int[][]{ {1,2,3} , {4,5,6}, {7,8,9} } );

}
}