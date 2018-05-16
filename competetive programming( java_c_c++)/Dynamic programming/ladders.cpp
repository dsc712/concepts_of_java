// ladders problem - no. of ways to reach nth step if one can take k types[1 , 2, 3 , .... , k ] of jump on ladder

// O(k^n) - if solved through recursion 
// O(n) - if solved through dp 

#include <bits/stdc++.h>
using namespace std;

int dp[10000000] ;
int ways(int n , int k )
{
    // ground
    if(n == 0)
       return dp[n] = 1 ; 
       
    // below ground - there is no way of going below ground 
    if(n < 0)
       return dp[n] = 0 ;
    
    // already calculated position 
    if(dp[n] != -1 ){
        return dp[n] ;
    }   
    
    int ans = 0 ;
    
    for(int i = 1 ; i <= k ; i++){
        ans += ways(n-i , k) ;
    }
       
    return dp[n] = ans ;
}

int main() {
  int n , k  ;
  memset(dp , -1 , sizeof(dp) ) ;
  cin>>n>>k ;
  cout<<ways(n,k) ;
  
 return 0 ;
}
