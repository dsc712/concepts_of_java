class Temp{
 public static void main(String... s){
  try{
     int x = 10/s.length ;
     System.out.println(x);
     int z[] = new int[s.length];
     z[5] = 1000 ;
   }
   catch(ArithmeticException e){
    System.out.println(e);
   }
   catch(ArrayIndexOutOfBoundsException e1){
    System.out.println(e1);
   }
  System.out.println("multiple catch blocks were required in this case");
 }
}