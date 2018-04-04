import java.util.*;
import java.math.*;

class JULKA {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        for (int t = 0; t < 10; t++) {
            BigInteger A = new BigInteger(in.next());
            BigInteger B = new BigInteger(in.next());
            BigInteger K = (A.add(B)).divide(new BigInteger("2"));
            BigInteger N = A.subtract(K);
            System.out.println(K.toString());
            System.out.println(N.toString());
        }
    }
}