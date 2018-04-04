import java.io.BufferedReader ;
import java.io.InputStreamReader ;
import java.io.IOException ;
import java.math.BigInteger ;


public class Main {
    static BigInteger solver(BigInteger num){
      
      num = num.multiply(new BigInteger("2") ).subtract(new BigInteger("2") ) ;
      return num ;
         
    } 
    
    public static void main(String args[]) throws IOException  {
      BigInteger n ;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
      String line = br.readLine()  ;
      while(line != null){
          n = new BigInteger(line) ;
          
          if( n.equals( BigInteger.ONE ) ) {
              System.out.println("1") ;
          }else{
              System.out.println(solver(n) ) ;
          }
          
          line = br.readLine() ;
      }
    }
}