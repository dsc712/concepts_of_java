// spoj -  minimum step to one[MST1] 
#include <bits/stdc++.h>
using namespace std;
int dp[20000001] ;



// int solveTopDown(int n){
//     if(dp[n] != -1)  // already calculated 
//         return dp[n] ;

//     if(n <= 1)
//         return 0 ; 
        
//      int subOne = INT_MAX ;
//      int divTwo = INT_MAX ;
//      int divThree = INT_MAX ;
     
//      if(n >= 2)
//       subOne = 1 + solveTopDown(n-1) ;
       
//      if(n % 2 == 0 )
//       divTwo = 1 + solveTopDown(n/2) ;
       
//      if(n%3 == 0 )
//       divThree = 1 + solveTopDown(n/3) ;
       
//      return dp[n] = min(subOne , min(divTwo , divThree)  ) ;
// }


void solveBottomUp(){
    //base Case
    dp[1] = 0  ;
    dp[0] = 0 ;
    //Iterate over all possible numbers starting from 2 
    for(int i = 2 ; i <= 20000001 ; i++ ){
        
        dp[i] = 1 + dp[i-1] ;
        
        if(i%2 == 0 ){
            dp[i] = min( dp[i] , 1 + dp[i/2] ) ;
        }
        
        if(i%3 == 0 ){
            dp[i] = min( dp[i] ,1 + dp[i/3] ) ;
        }
    }
    
    return ;
 }
int main() {
    
    int k , n , count = 1 ; 
    memset(dp , 0 , sizeof(dp) ) ;
    cin>>k ; 
    solveBottomUp() ;
    while(k--){
        cin>>n ; 
        cout<<"Case "<<count<<": "<<dp[n]<<endl  ;
        count++ ;
    }
}
