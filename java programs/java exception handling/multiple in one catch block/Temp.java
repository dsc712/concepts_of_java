class Temp{
 public static void main(String... s){
  try{
     int x = 10/s.length ;
     System.out.println(x);
     int z[] = new int[s.length];
     z[5] = 1000 ;
   }
   catch(ArithmeticException|ArrayIndexOutOfBoundsException e){  //these exception classes should be parallel to each other
     System.out.println(e) ;
   }
  System.out.println("multiple catch blocks were required in this case");
 }
}