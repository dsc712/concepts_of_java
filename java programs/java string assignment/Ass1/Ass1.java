class Ass1
{
 static int wordCount(String s)
 {
   int i,count = 1;
   String s1 = s.trim() ;
   for( i=0 ; i < s1.length() ; i++ )
    {
      if( s1.charAt(i) == ' ') 
        count++ ;    
     }
   return count ;
  }



 public static void main(String... args)
 {
   int count ;
   count = wordCount( new String("   I love coming to ducat.   ") ) ;
   System.out.println("number of words in the string is : " + count ) ;
  }
}