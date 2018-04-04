#include <iostream>
using namespace std;

int reverse(int n){
    int num = n ;
    int rev = 0 , digit = 0 ;
    
    while(num > 0){
        digit = num%10 ;
        rev  = rev*10 + digit ;
        num /= 10 ;
    }
    
    return rev;
}
int main() {
    int tc , n1 , n2 , sum ;
    
    cin>>tc ;
    
    while(tc--){
        cin>>n1>>n2 ;
        n1 = reverse(n1) ;
        n2 = reverse(n2) ;
        sum = n1 + n2 ;
        sum = reverse(sum) ;
        
        cout<<sum<<"\n" ;
    }
}
