/*
  String constants are implicitly interned.Although we should compare Strings using
  equals() method but == is faster than it. So using == operator after interning 
  the strings is a good idea.
  
  The algorithm for checking the Strings for equality( using equals() ) involves: 

a) If the String objects are equals as per == operator, true is returned. 
b) If the == returns false then each character of both the strings are compared and
   if a difference if found, immediately false is returned. 
c) If after comparing all characters of both the strings, no difference is found in
   characters and length of strings, true is returned. 

*/

public class TestString {

    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);   // true
        System.out.println(s2 == s3);   // false
        System.out.println(s3 == s4);   // false
        System.out.println(s1 == s3);   // false
        System.out.println(s1 == s4);   //true
        System.out.println(s1.equals(s2));  //true
        System.out.println(s2.equals(s3));  //true
        System.out.println(s3.equals(s4));  //true
        System.out.println(s1.equals(s4));  //true
        System.out.println(s1.equals(s3));  //true
    }

}