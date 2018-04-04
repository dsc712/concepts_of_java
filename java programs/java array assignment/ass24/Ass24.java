class Ass24
{
 static void maxOneInRow( int x[][] )
 {
   int i,j,k=0,max;
   int row[] = new int[5];
   int maximum[] = new int[5];
/*________________________________________________________________________________________________________________________________*/   
   for( i=0 ; i<x.length ; i++)
    {
      for( j=0 ; j<x[i].length ; j++)
       { 
          if( x[i][j] == 1)
            {
              row[i] = 5-j ;
              break; 
             }
          }
      }
/*__________________________________________________________________________________________________________________________________*/
      maximum[k] = 1 ;
      max = row[0] ;
   for( i=1 ; i<row.length ; i++ )
    {
       if(row[i] == max)              
         {
           maximum[++k] = i+1 ;
          }
       if(row[i] > max && k==0 )
         {
           max = row[i] ;
           maximum[k]= i+1 ; 
           }
       if( (row[i] > max) && k > 0 )
          {
            k=0;
            maximum[k] = i+1 ; 
            max = row[i] ;
             }
        }
/*___________________________________________________________________________________________________________________________________*/
    
    for( i=0 ; i <= k ; i++ )
     {
       System.out.print( maximum[i] + " ,");
        }
     if( k==0 )
       System.out.print("row number has the maximum one in one row. ");
     else
       System.out.print("are the row numbers having maximum one in one row. ");
/*____________________________________________________________________________________________________________________________________*/
}

 public static void main( String... args )
  {
    maxOneInRow( new int[][]{ {0,0,0,1,1} , {0,0,0,0,1} , {0,0,0,1,1} , {0,0,1,1,1} , {0,1,1,1,1} } );   
    
    }
}