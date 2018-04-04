class Ass10
{
 static int vowelCount(String s)
 {
   int i,count = 0; 
   s.toLowerCase();
   char ch[] = s.toCharArray();
   for( i=0 ; i<s.length() ; i++)
   { 
     switch(ch[i])
      {
        case 'a': 
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            count++ ;
        default:
         
        }
    }
   return count;
  }
 
 public static void main(String... args)
 {
   int count ;  
   count = vowelCount( new String("   East or West India is the best   ") ) ;
   System.out.println("number of vowels in the given string is : " + count ) ;
  }
}