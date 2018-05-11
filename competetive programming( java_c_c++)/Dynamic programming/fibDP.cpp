#include <bits/stdc++.h>
using namespace std;

int dp[100005] ; 


// recursion is o(2^n) , while DP is o(n) 
int fib(int n , int dp[] ){

 if(n == 0 || n == 1 ){
     dp[n] = n ;
     return n ;
 }    
 
 // already calculated fibonacci number  
 if(dp[n] != -1){
     return dp[n] ;
 }else{ // otherwise 
     dp[n] = fib(n-1 , dp ) + fib(n-2 , dp ) ;
     return dp[n] ;
 }
 
}

int main() {
    int n ; 
    
    // initializing our array for storing the values
    // for(int i = 0 ; i < sizeof(dp)/sizeof(int) ; i++  ){
    //     dp[i] = -1 ;
    // }
    
    // or initializing  this way 
     memset(dp , -1 , sizeof(dp) ) ;
    
    cin>>n ; 
    cout<<fib( n , dp ) ;
}
