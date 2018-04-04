class Ass6
{
 static String lTrim(String s)
 {
   int count = 0 , i ;
   for( i = 0 ; i < s.length() ; i++ )
    {
      if(s.charAt(i) != ' ')
       break ;

      count++ ;
     }
   System.out.println("length before left trim : " + s.length() ) ;
   String s1 = s.substring(count) ;
   System.out.println("length after  left trim : " + s1.length() ) ;

  return s1 ;
  }

 public static void main(String... args)
 {
   String s3 = lTrim(new String("     sirf left se trim krna bhaiyyaaa       " )  ) ; 
   System.out.println("string after left  trim  :" + s3 );
  }
}