class Ass25
{
 static void numToWord( int x[] )
 {
   String ones[] = {"one" , "two" , "three" , "four" , "five" , "six" , "seven" , 
                    "eight" , "nine" , "ten" , "eleven" , "twelve" , "thirteen" ,
                    "fourteen" ,"fifteen" , "sixteen" , "seventeen" , "eighteen" , "nineteen" } ;

   String tens[] = {"ten" , "twenty" , "thirty" , "forty" , 
                     "fifty" , "sixty" , "seventy" , "eighty" , "ninety" } ;
   
   String place[] = {"hundred" , "thousand" , "million" ,
                       "billion" , "trillion" , "quadrillion" } ;
    
   int quo , rem , i , j ; 
  
   quo = x.length / 3 ;
   rem = x.length % 3 ;
     
   for( i = 0 ; i<x.length ; i++ )
    {
      System.out.print(x[i]) ;
     }
   System.out.print("->") ; 

   if( rem == 0 ) 
    {  
          for( i=0 , j=0 ; i < quo ; i++ , j+=3 )
            {
               System.out.print(ones[ x[j] - 1 ] + "  " + place[0] + "  ") ;
   
              if(x[j+1] == 0)
               {
                 if(i == quo - 1)
                       System.out.print(ones[ x[j+2] -1 ] + "  ") ;
                 else
                     System.out.print(ones[ x[j+2] -1 ] + "  " + place[quo - (i+1)] + "  ") ;
                     continue ;
                }

               if(x[j+1] == 1)
                {
                 if(i == quo - 1)
                   System.out.print(ones[ x[j+2] -1 ] + "  ") ;
                 else
                   System.out.print( ones[9 + x[j+2] ] + "  " + place[quo - (i+1) ] + "  ") ;
                  continue ;
                  
                 }      
                 System.out.print(tens[ x[j+1] -1 ] + "  " + ones[ x[j+2] - 1] + "  " + place[quo -(i+1)] + "  ") ;

             }
      
     }

   if( rem == 1 )
    {
         System.out.print( ones[x[0] - 1] + "  " + place[ quo ] + "  " ) ;
       
           for( i=1 , j=1 ; i<=quo ; i++ , j+=3 )
            {
          
              System.out.print( ones[ x[j] - 1 ] + "  " + place[0] + "  ");     
                            
              if( x[j+1] == 0 )
                {
                  if( i == quo )
                    System.out.print(ones[ x[j+2] -1 ]  + "  " ) ;
                  else
                    System.out.print(ones[ x[j+2] -1 ]  + "  " + place[quo - i] + "  ") ; 
                  continue ;
                }
                        
    
               if(x[j+1] == 1)
                {
                  if( i == quo )
                    System.out.print( ones[9 + x[j+2] ] + "  " ) ;
                  else
                    System.out.print( ones[9 + x[j+2] ] + "  " + place[quo - i]) ;
                     continue ;
                }
      
                 System.out.print(tens[ x[j+1] -1 ] + "  " + ones[ x[j+2] - 1] + "  " + place[quo -(i)] + "  ") ;

            }
    
     }
  
   if( rem == 2 )
    {
      if( x[0] == 1 )
        System.out.print( ones[ x[1] + 9 ] + "  " + place[quo] + "  ") ;    
      else 
        System.out.print( tens[ x[0]-1 ] + "  " + ones[ x[1]-1 ] + "  " + place[quo] + "  ") ;
       
       for( i=2 , j=2 ; i<=quo+1 ; i++ , j+=3 )
        {
          System.out.print( ones[ x[j] - 1 ] + "  " + place[0] + "  ");     
                            
              if( x[j+1] == 0 )
                {
                  if( i == quo +1)
                   System.out.print(ones[ x[j+2] -1 ]  + "  ") ;
                  else
                   System.out.print(ones[ x[j+2] -1 ]  + "  " + place[quo -(i-1)] + "  ") ;
                    continue ;
                }
                        
    
               if(x[j+1] == 1)
                {
                  if( i==quo+1 )
                   System.out.print( ones[9 + x[j+2] ] + "  " ) ;
                  else
                    System.out.print( ones[9 + x[j+2] ] + "  " + place[quo - (i-1) ] + "  ") ;
                    continue ;
                }
      
                 System.out.print(tens[ x[j+1] -1 ] + "  " + ones[ x[j+2] - 1] + "  " + place[quo -(i-1)] + "  ") ;

            
          }
     }             
}
     


 public static void main( String... args )
 {
   System.out.println("\n\n___________________________________________________________________________________________________") ;
   numToWord( new int[]{6,4,2,1,5,7,3,1,2,6,1,3,1,2,3}  )  ;
   System.out.println("\n\n___________________________________________________________________________________________________") ;
  }
}