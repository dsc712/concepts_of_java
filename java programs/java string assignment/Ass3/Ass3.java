class Ass3
{
 static int charCount(String s)
 {
   int i,count = 0 ;
   String s1 = s.trim() ;
   
    for( i=0 ; i<s1.length() ; i++ )
    {
      if(s1.charAt(i) == ' ' || s1.charAt(i) == '.' ) 
       {
         continue; 
        }
      else
        {
          count++ ;
         } 
      } 
   return count ;
  }

 public static void main(String... args)
 {
   int count ;
   count = charCount(new String("   mai aaj bhi faike hue paise nhi uthaata.   ") );
   System.out.println("number of characters  =  " + count ) ;
  }
}