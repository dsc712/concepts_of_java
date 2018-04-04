class Ass30
{
static int find3rdLargestElement( int x[] )
{
  int max1=x[0] , max2=x[0] , max3=x[0] ;
  int i,count=0; 
 /*_____________________________________________________________*/ 
  for( i=0 ; i<x.length ; i++ )
   {
     if( x[i] > max1 && count==0 )
      {
        max1 = x[i] ;
        count++ ; 
        }
     else if( x[i] > max1 && count==1 )
       {
         max2=max1 ;
         max1=x[i] ;
         count++;
         }
     else if( x[i] > max1 && count>=2 )
       {
          max3 = max2 ;
          max2 = max1 ;
          max1 = x[i] ;
          count++ ;
          }
      }
  /*________________________________________________________________*/
   
   return max3 ;
}

public static void main( String... args )
 {
   int max3 ;
 
   max3 = find3rdLargestElement( new int[]{4,6,2,8,5,3,9,1,7,10,12} ) ;
   
   System.out.println("\n\n3rd largest element of the array is  " + max3 ) ;
  }
}