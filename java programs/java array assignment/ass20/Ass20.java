class Ass20
{
 static void shift( int x[] )
 {
   int i,j,count,count1, temp ;
      
  /*_____________logic for sorting ____________________________________________________________*/

     for(i=0;i<x.length-1;i++)   // n-1 passes
      {
        count=0;
        for(j=0;j<x.length-1-i;j++)
         {
            if(x[j]>x[j+1])
             {
               temp=x[j];
               x[j]=x[j+1];
               x[j+1]=temp;
               count++;
              }
         }   
          if(count==0)
            break; 
        }
 /*_______________logic for counting the negative integers in array__________________________________________*/  
      
    count1 = 0 ;
    i=0;
    while( x[i] < 0 )      
     {
      i++ ;
      count1++ ;
      }
 /*_______________sorting only negative integers in the decreasing order_____________________________________*/
     
    for(i=0;i<count1-1;i++)   // n-1 passes
      {
        count=0;
        for(j=0;j<count1-1-i;j++)
         {
            if(x[j]<x[j+1])
             {
               temp=x[j];
               x[j]=x[j+1];
               x[j+1]=temp;
               count++;
              }
         }   
          if(count==0)
            break; 
        }
/*_________________printing the resultant array_______________________________________________________________*/
   
    for( i=0; i<x.length ; i++ )
      {
          System.out.print("   " + x[i] ) ;
          
          }
   
   }

 public static void main( String... args )
 {
   shift( new int[]{ 1,2,3,-2,4,-3,-1,5,-4,-5 } ) ;
   
  }
}