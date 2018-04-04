class Temp
{
  public static void main(String... s){
    try{
       int x = 10/0 ;
       System.out.println(x) ; // this will be skipped
      }
    catch(Exception e){
       System.out.println(e) ;
     }

     System.out.println("this will be printed") ;
  }
}