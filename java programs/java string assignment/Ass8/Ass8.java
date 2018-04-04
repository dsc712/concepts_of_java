class Ass8
{
 static String allTrim(String s)
 {
  int i , count = 0 ;
  
 for( i=0 ; i < s.length() ; i++ )
  {
    if(s.charAt(i) != ' ' ) 
     break ;
    
    count ++ ;
   }
  
  String s1 = s.substring(count) ;
  
   count = 0 ;
  
  for( i=s1.length() -1 ; i >= 0 ; i-- )
   {
       if(s.charAt(i) != ' ' ) 
        break ;
       
       count++ ;
    }
  System.out.println("length of string before trimming : " + s.length() ) ;
  String s2 = s1.substring(0,s1.length() -(1+count) ) ;
  System.out.println("length of string after  trimming : " + s2.length() ) ;

return s2 ;
 } 

 public static void main(String... args)
 {
  String s3 = allTrim( new String("      bhaiyaa left-right iss baar dono trim kr do      ") );
  System.out.println("String after trim :" + s3) ;
  }
}