class Ass21
{
 
static void frequencyCount( int x[] )
{
  int i , j , count ;
  int occur[] = new int[100] ;

  for( i=0 ; i<x.length ; i++)
   {
      if( occur[x[i]] > 0)
       continue ;

      count = 0;

      for( j=0 ; j < x.length ; j++ )
       { 
         if(x[i] == x[j])
          count ++ ; 
         }
       System.out.printf("%d   %d \n",x[i],count);
       occur[ x[i] ]++ ;
     }

}

 
public static void main(String... args)
{
  frequencyCount( new int[]{3,5,7,2,9,8,6,4,5,1,2,3} );
 
 } 

}