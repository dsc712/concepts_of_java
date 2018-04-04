class Ass2
{
 static int spaceCount(String s)
  {
   int i,count = 0 ;
   String s1 = s.trim();
   
   for( i=0 ; i<s1.length() ; i++ )
    {
     if(s1.charAt(i) == ' ' )
      count++ ;
     }
 return count ;   
}
 public static void main(String... args)
 {
   int count ;
   count = spaceCount( new String("   ducat is the best place to learn java.   ") );
   System.out.println("no. of spaces(ducat is the best place to learn java.)  = " + count );
  }

}