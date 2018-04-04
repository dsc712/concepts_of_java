class Ass29
{
 static void hcf( int x[] )
 {
  int min,i ; 
 /*______________logic for hcf____________________________*/
  
  while( (x[0] != x[1]) || (x[1] != x[2]) || (x[2] != x[3]) )
  {
    min = x[0] ;
    for( i=0; i<x.length ; i++ )     
     {
       if( x[i] < min )
         min = x[i] ;
       }
     for( i=0 ; i<x.length ; i++ )
     {
       if( x[i] != min )
        {
         x[i] = x[i] - min ;
          
          }
      }
   }
/*____________printing the hcf of given elements___________________*/
    
   System.out.println("hcf of the given array elements is  " + x[0] ) ;
  }
  
 
 public static void main( String... args )
 {
  hcf( new int[]{5,10,15,20} ) ;
  
  }
}