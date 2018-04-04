class Ass9
{

static String squeeze(String s)
{
  String s1=s.trim() ;
  int i,j ;
  char ch[] = new char[30];
  for( i=0,j=0 ; i < s1.length() ; i++ )
   {
     if( s1.charAt(i) != ' ' )
      {
        ch[j] = s1.charAt(i) ; 
        j++ ;
       } 
    }
   
   String s2 = new String(ch) ;
   String s3 = s2.trim() ;

return s3 ;
}

public static void main(String... args)
{
  String s1 = squeeze( new String("   life is awesome   ") ) ;
  System.out.println("String after squeezing is :" + s1 ) ;
}

}