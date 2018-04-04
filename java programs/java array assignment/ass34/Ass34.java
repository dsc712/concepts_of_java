class Ass34
{

static void makeAllElementZero( int x[][] )
{
  int i,j,flag = 0;
  
  for( i=0 ; i<x.length ; i++ )
   {
     for( j=0 ; j<x[0].length ; j++ ) 
      {
        if( x[i][j] == 0 && i != 0 && j != 0 && i != x.length-1 && j != x.length-1 )  // case1
         {
           x[i-1][j] = 0 ; 
           x[i+1][j] = 0 ;
           x[i][j-1] = 0 ;
           x[i][j+1] = 0 ;
           flag = 1 ;
           break ;
          }
        else if( x[i][j] == 0 && i==0 && j!=0 && j!=x.length-1  )  // case2
         {
           x[i+1][j] = 0 ;
           x[i][j-1] = 0 ;
           x[i][j+1] = 0 ;
           flag = 1 ;
           break ;
          }
        else if( x[i][j] == 0 && i!=0 && j==0 && i!=x.length-1 )  // case3
         {
            x[i+1][j] = 0 ;
            x[i-1][j] = 0 ;
            x[i][j+1] = 0 ;
             flag = 1 ;
           break ;
          }
        else if( x[i][j] == 0 && i==0 && j==0 )  // case4
         {
           x[i][j+1] = 0 ;
           x[i+1][j] = 0 ; 
            flag = 1 ;
           break ;
          }
        else if( x[i][j] == 0 && i==x.length-1 && j!=x.length-1 && j!=0 )  //case5 
         {
           x[i][j+1] = 0 ;
           x[i][j-1] = 0 ;
           x[i-1][j] = 0 ; 
            flag = 1 ;
           break ;
          }
         else if( x[i][j] == 0 && i!=x.length-1 && j==x.length-1 &&  i!= 0 )  //case6
         {
           x[i-1][j] = 0 ;
           x[i+1][j] = 0 ; 
           x[i][j-1] = 0 ;
            flag = 1 ;
            break ;
          }
          else if( x[i][j] == 0 && i==x.length-1 && j==x.length-1 )  //case7
         {
           x[i][j-1] = 0 ;
           x[i-1][j] = 0 ;
            flag = 1 ;
           break ;
            
          }
          else if( x[i][j] == 0 && i==0 && j==x.length-1 )   //case8
         {
           x[i][j-1] = 0 ;
           x[i+1][j] = 0 ; 
            flag = 1 ;
           break ;
          }
          else if( x[i][j] == 0 && i==x.length-1 && j==0 )  ///case9
         {
           x[i][j+1] = 0 ;
           x[i-1][j] = 0 ; 
            flag = 1 ;
           break ;
          }
          else
           {
             continue ;
            }
       }
        
         if( flag == 1 )
          break ;
     }

    for( i=0 ; i<x.length ; i++ )
     {
       for( j=0 ; j<x[i].length ; j++ )
         {
           System.out.print(x[i][j] + "  ") ; 
          } 
          System.out.println() ;
        }
}

public static void main(String... args)
{
   makeAllElementZero( new int[][]{ {1,3,5,7,3} , {2,4,0,9,9} , {4,3,1,9,7} ,{2,7,8,6,5} , {0,9,8,2,0} }) ;
   
  }
}