class Ass33
{
  static void Mode(int x[])
   {
     int i , j , k=0 , count , countMax=0;
    
     int mode[] = new int[10];
     mode[0] = x[0] ;

      for( i=0 ; i < x.length ; i++ )
       {
         count = 0 ;

          for( j=i+1 ; j < x.length ; j++)
           {
             if( x[i] == x[j])
               {
                 count ++ ;
                 } 
             
              }

            if(i==0)
             {
               countMax = count ;
               }

            else if( count > countMax)
              {
                countMax = count ;
                mode[k] = x[i] ;
                }

             else if( count == countMax)
               {
                   mode[++k] = x[i]; 
                 } 
          }
       
        if( k==0 )
          {
            System.out.println(mode[k]);
            }
         else
           {
             for( i=0 ; i <= k ; i++)
               {
                 System.out.printf(" %d , ",mode[i]); 
                 
                 }
               System.out.printf(" are  modes of the given array. ");
             
             }
     } 
 
  public static void main(String... args)
   {
      Mode(new int[]{1,3,4,2,2,4,6,7,3});
      
     }
 }