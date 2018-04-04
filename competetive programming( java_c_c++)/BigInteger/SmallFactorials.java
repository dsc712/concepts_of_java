import java.io.BufferedReader ;
import java.io.InputStreamReader ;
import java.io.IOException ;
import java.math.BigInteger ;


public class SmallFactorials {
    static BigInteger solver(int num){
      
        BigInteger n = new BigInteger("1");
        
        for(int i = 1 ; i<=num ; i++){
            n = n.multiply(BigInteger.valueOf(i)) ;
        }
        
        return n ;
         
    } 
    
    public static void main(String args[]) throws IOException  {
     int tc , num ;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
      tc = Integer.valueOf( br.readLine() ) ;
      
       while( (tc--) != 0 ){
           num = Integer.valueOf( br.readLine() ) ;
           System.out.println( solver(num) ) ;
       }
       
     br.close() ;
    }
}