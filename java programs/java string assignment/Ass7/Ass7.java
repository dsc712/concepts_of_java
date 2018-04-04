class Ass7
{
 static String rTrim(String s)
 {
   int count = 0 , i ;
   for( i = s.length() - 1 ; i >= 0 ; i-- )
    {
      if(s.charAt(i) != ' ')
       break ;

      count++ ;
     }
   System.out.println("length before right trim : " + s.length() ) ;
   String s1 = s.substring(0 , s.length() -(1+count) ) ;
   System.out.println("length after  right trim : " + s1.length() ) ;

  return s1 ;
  }

 public static void main(String... args)
 {
   String s3 = rTrim(new String("     sirf right se trim krna bhaiyyaaa       " )  ) ; 
   System.out.println("string after right  trim  :" + s3 );
  }
}