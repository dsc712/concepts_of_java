#include <iostream>
using namespace std;
int fast_power(int a , int b){
    if(b == 0 )
      return 1 ;
     
     int smaller_ans = fast_power(a , b/2) ;
     smaller_ans *= smaller_ans ;
     
     // if b is odd 
     if(b & 1){
         smaller_ans *= a ;
     }
     return smaller_ans ;
     
}
int main() {
    int a, b ;
    cin>>a>>b ;
    
    cout<<fast_power(a , b) ;
}
