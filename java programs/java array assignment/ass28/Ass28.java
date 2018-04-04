class Ass28
{
 
static void lcm( int x[] )
{
  int y[] = new int[x.length] ;
  int i,max;
  
  /*_________copying the elements of x into y___________________*/
  for( i=0 ; i<x.length ; i++ ) 
   {
     y[i] = x[i] ; 
    }
 
  /*_________logic for finding lcm of elements of given array____*/

  while( (x[0] != x[1]) || (x[1] != x[2]) || (x[2] != x[3])  )
   {
     max = x[0] ; 
     for( i=0 ; i<x.length ; i++ )  // finding maximum element of the array
       {
         if( x[i] > max )
          max = x[i] ;
          }

     for( i=0 ; i<x.length ; i++ )  // increasing the multiple of all the elements except those with largest value
      {
        if(x[i] != max )
         {
            x[i] = x[i] + y[i] ;
           
          }
       }
   }
 /*_______________________printing the lcm of the given elements of array___________*/
 
     System.out.println("\n\n  lcm of the given elements of array is " + x[0]  ) ;

/*________________________end of the function lcm___________________________________*/

 }


public static void main(String... args)
{
  lcm( new int[]{ 5,10,15,20 } ) ;
 
 }

}