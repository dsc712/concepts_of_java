class Ass11
{

 static int length(String s)
 {
    int len ;
    len = s.lastIndexOf("") ;  //printing the indexof substring of 0 length from last (which is actually equal to length of string)
    return len ;
  }
 
 public static void main(String... args)
 {
   int len = length(new String("   come fall inlove with programming   ") ) ;
   System.out.println("length of the given string is " + len) ;

  }
}