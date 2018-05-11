// minimum coin change problem using recursion - O(k^n) time comlexity 
#include <bits/stdc++.h>
using namespace std;

// this function returns the minimum number of coins to make the change 
int solve(int coins[] , int k , int n) {
    if(n == 0 ){
        return 0 ; 
    }
    
    int res = INT_MAX ;
    
    // try every denomination coin 
    for(int i = 0 ; i < k  ; i++){
        
            // if the current denomination can be picked for change
            if(coins[i] <= n ){
                int sub_res = 1 + solve(coins , k , n - coins[i] ) ;
                
                // see if result can be minimized 
                
                if(sub_res < res ){
                    res = sub_res ;
                }
                
            }
            
    }
    return res ;
}
int main() {
    int coins[] = {25 , 10 , 5  } ; // all denominations available 
    int k = sizeof(coins)/sizeof(int) ;  // m is number of denominations available to us 
    int amount = 30 ;
    cout<<solve(coins , k , amount  ) ;
}
