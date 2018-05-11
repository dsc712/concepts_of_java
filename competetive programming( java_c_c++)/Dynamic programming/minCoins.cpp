// minimum coin change problem in O(n) time comlexity using DP  
// greedy approach will not work here 
#include <bits/stdc++.h>
using namespace std;
int dp[20000000];

// top down DP approach 
int solveTopDown(int coins[] , int k , int n) {
    
    // base case
    if(n == 0 ){
        return dp[n] = n ; 
    }
    
    // already calculated result 
    if(dp[n] != -1 ){
      return dp[n] ;    
    }
    
    int res = INT_MAX ;
    
    // try every denomination coin 
    for(int i = 0 ; i < k  ; i++){
        
            // if the current denomination can be picked for change
            if(coins[i] <= n ){
                int sub_res = 1 + solveTopDown(coins , k , n - coins[i] ) ;
                
                // see if result can be minimized 
                
                if(sub_res < res ){
                    res = sub_res ;
                }
                
            }
            
    }
    return dp[n] = res ;
}

int main() {
    int coins[] = {1 , 7 , 10 } ; // all denominations available 
    int k = sizeof(coins) / sizeof(int) ;  // m is number of denominations available to us 
    int amount = 15 ;
    
    memset(dp , -1 , sizeof(dp) ) ;
    cout<<solveTopDown(coins , k , amount  )<<endl ;
}
