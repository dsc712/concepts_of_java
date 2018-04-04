class MatrixAdd
{
static void matrixAdd(int x[][],int y[][])
{
  int z[][]=new int[3][3];
  int i,j;  

  for(i=0;i<x.length;i++)
   {
     for(j=0;j<x[i].length;j++)
       {
          z[i][j]=x[i][j]+y[i][j]; 
          }
     }
   
   System.out.println("matrix after addition is:");

  for(i=0;i<z.length;i++)
   {
      for(j=0;j<z[i].length;j++)
       {
         System.out.print("  "+z[i][j]);
          }
        System.out.println();
      }
}

public static void main(String... args)
{
  matrixAdd(new int[][]{ {1,2,3} , {3,4,5}, {6,7,8} },  new int[][]{ {6,7,8} , {3,4,5} , {1,2,3} });

}
}