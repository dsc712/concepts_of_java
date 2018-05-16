// 0-1 knapsack - maximising by either including the current item or exluding the current item 
#include <bits/stdc++.h>
using namespace std;

// via recursion - generating all possible permutations 
int knapsack(int wts[] , int prices[] , int n , int w ) {
    // base case is if number of items or capacity of bag is 0 , thief cannot earn any profit
    if(n == 0 || w == 0 ){
        return 0 ;
    }
    
    int inc = 0 , exc = 0 ;
    
    //include
    if(wts[n-1] <= w ){
        inc = prices[n-1] + knapsack(wts , prices , n-1 , w - wts[n-1] ) ;
    }
    
    //excluding current item 
    
    exc = knapsack(wts , prices , n-1 , w ) ;
    
    return max(inc , exc  ) ;
     
}

// bottom up - optimizing using ( 2-d DP )  

int bottomUp(int wts[] , int prices[] , int n , int w ){
    
   int dp[100][100] ;
   
   for(int i = 0 ; i <= n ; i++){ // iterating over number of items allowed to take 
   
       for(int j = 0 ; j <= w ; j++ ){ // iterating over weight allowed to take
           
           // base case 
           if(i == 0 || j == 0){
              dp[i][j] = 0 ;
           }
           else{
               
           int inc = 0 , exc = 0  ;
           
           if( wts[i-1] <= j ){
               
               inc = prices[i-1] + dp[ i-1 ][j - wts[i-1]] ;
               
           }
           
           exc = dp[i - 1][ j ] ;
           
           dp[i][j] = max(inc , exc) ;
           }
           
       }
   }
   
   // the 2d grid looks like - 
//   for(int i=0 ; i<= n ; i++){
//       for(int j = 0 ; j <= w ; j++){
//           cout<<dp[i][j]<<" " ;
//       }
//       cout<<endl ;
//   }
   return dp[n][w] ;
}

int main() {
    int wts[] = {2 , 2 , 3 , 1 } ;
    int prices[] = {5 ,  20 , 20 , 10 } ;
    
    int n = 4 ; // total no. of items 
    int w = 5 ; // capacity of bag of thief 
    
    int maxProfit = knapsack(wts , prices , n , w ) ;
    cout<<maxProfit<<endl  ;
    cout<<bottomUp(wts , prices , n , w ) ;
}
