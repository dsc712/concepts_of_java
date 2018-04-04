class Ass22
{
 static void firstNonRepeatingElement( int x[] )
 {
  int i,j,count,num=0;
  
  for( i=0 ; i<x.length ; i++ )
   {
    count=0 ;
     for(j=0 ; j<x.length ; j++ )
      {
        if( i==j )   
          continue;
        if( x[i] == x[j] )
          {
            count++;
            break;
           }
        }
         if( count==0)     
           {
             num = x[i];
             break; 
            }
      } 
System.out.println("\n First non repeating element is " + num);
  
  }
 public static void main( String... args )
 {
   firstNonRepeatingElement( new int[]{1,2,4,4,3,5,2,1,6} );
     
  }
}