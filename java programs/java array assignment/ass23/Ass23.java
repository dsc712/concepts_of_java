class Ass23
{
 
 static int binaryToDecimal( int x[] )
 {
   int i,dec=0,base=1;
   for( i= x.length-1 ; i>=0 ; i-- )
    {
      dec += x[i] * base ;
      base *= 2 ;
      
     }
    return dec ;
  } 

 public static void main( String... args )
 {
   int decimal ;
   decimal = binaryToDecimal( new int[]{1,0,0,0,1,1,0,1,1,0,1,1,0,1,1} );
   System.out.println("\n\nDecimal equivalent of the given binary number is " + decimal) ;  

   }
}