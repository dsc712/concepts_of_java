class Ass4
{
 static String reverse(String s)
 {
   int i,len;
   String s1 = s.trim() ;
   System.out.println("Original string is  :  " + s1) ;
   len = s1.length() ;
   char revArray[] = new char[len] ;
   
   for( i=0 ; i<len ; i++ )
    {
      revArray[i] = s1.charAt(len - (1 + i) ) ;
     
    }
    String s3 = new String(revArray) ;
   
   return s3 ;
  }

 public static void main(String... args)
 {
  String s2 = reverse(new String("  sir data structures bhi pdhaaenge through java    ") );
  System.out.println("reverse of the given string is  :  " + s2 ) ;
  }

}