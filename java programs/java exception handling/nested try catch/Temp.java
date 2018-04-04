/* It is used to avoid the problem of skipping of lines b/w try and catch block due to exceptions  */

class Temp{
 public static void main(String... s){
  try{

       try{
         int x = 10/s.length ;
         System.out.println(x);
         }
       catch(ArithmeticException e2){
         System.out.println(e2) ;  
       }
    
        try{
             int z[] = new int[s.length];
             z[5] = 1000 ;
           }
        catch(ArrayIndexOutOfBoundsException e1){
              System.out.println(e1) ;
            }
   }
   catch(Exception e){ 
     System.out.println(e) ;
   }
  System.out.println("multiple catch blocks were required in this case");
 }
}