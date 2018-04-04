class ContentEquals
{
 public static void main(String... args)
 {
   String str1 = "not immutable" ;
   String str2 = "strings are immutable" ;
 
   StringBuffer str3 = new StringBuffer("not immutable") ;
  
   boolean result = str1.contentEquals(str3) ;
   System.out.println(result) ;
   result = str2.contentEquals(str3) ;
   System.out.println(result) ;

  }
}