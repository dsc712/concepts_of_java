#include <iostream>
using namespace std;
int main() {
       
    char a[50] ;
    cin>>a ;
    
    int i = 0 ;
    if(a[i] == '9')
      i++ ;
      
    // iterate over the remaining characters
    for( ; a[i] != '\0' ; i++ ){
        
        int digit = a[i] - '0' ;  // converts ascii character into an integer 
        if(digit >= 5 ){
            digit = 9 - digit ;
            a[i] = digit + '0' ; // converting integer back into ascii character
        }
    }
    
    cout<<a<<endl ;
    
    
 return 0 ;
}
