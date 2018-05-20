/* Java program to count minimum number of operations
   to get the given arr array */
   
/*
   Incremental operations:Choose 1 element from the array and increment its value by 1.
   Doubling operation: Double the values of all the elements of array.
*/
import java.io.* ; 
import java.util.* ; 
class Test
{
    
    // Returns count of minimum operations to covert a
    // zero array to arr array with increment and
    // doubling operations.
    // This function computes count by doing reverse
    // steps, i.e., convert arr to zero array.
    static int countMinOperations(int n , int arr[] )
    {
        // Initialize result (Count of minimum moves)
        int result = 0;
      
        // Keep looping while all elements of arr
        // don't become 0.
        while (true)
        {
            // To store count of zeroes in current
            // arr array
            int zero_count = 0;
      
            int i;  // To find first odd element
            for (i=0; i<n; i++)
            {
                // If odd number found
                if (arr[i] % 2 == 1)
                    break;
      
                // If 0, then increment zero_count
                else if (arr[i] == 0)
                    zero_count++;
            }
      
            // All numbers are 0
            if (zero_count == n)
              return result;
      
            // All numbers are even
            if (i == n)
            {
                // Divide the whole array by 2
                // and increment result
                for (int j=0; j<n; j++)
                   arr[j] = arr[j]/2;
                result++;
            }
      
            // Make all odd numbers even by subtracting
            // one and increment result.
            for (int j=i; j<n; j++)
            {
               if (arr[j] %2 == 1)
               {
                  arr[j]--;
                  result++;
               }
            }
        }
    }
   
    // Driver method to test the above function
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
        int n ; // size of array 
        int k ; // number of testcases ;
        
        k = sc.nextInt() ;
        
        while(k-- != 0 ){
            n = sc.nextInt() ;
            int arr[] = new int[n] ;
            for(int i = 0 ; i < n ; i++ ){
                arr[i] = sc.nextInt() ;
            }
            
            System.out.println( countMinOperations(n , arr) ) ;
        }
        
    }
}


/*
   sample input : 
   
    5
    2
    2 1
    3
    16 16 16
    1
    100
    5
    0 0 1 0 1
    6
    123 234 345 456 567 789 


 sample output : 
 
    3
    7
    9
    2
    40
*/