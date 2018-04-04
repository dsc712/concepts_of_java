#include <iostream>
using namespace std;
int solve(int n , int m , int k , int a[]){
    
       int count = 0 ;
       // loop runs for the number of times switch is pressed ON/OFF
       while(k--){
           int min = 0 ;
           
           // logic for finding minimum number from the array
           for(int i = 0 ; i < n ; i++ ){
               if(a[i] < a[min] )
                 min = i ;
           }
           
           // toggling the state of lights in the row having minimum number of glowing diamonds
           a[min] = m - a[min] ;
       }
       
      
       // calculating the total number of glowing lights
       for(int i = 0 ; i<n ; i++){
           count += a[i] ;
       }
       return count ;
}

int main() {
    int tc,n,m,k,count;
    char ch ;
    
    cin>>tc ;
    
    while( tc-- ){
        cin>>n>>m>>k ;
        int lights[n] ;
        
        for(int i=0 ; i<n ; i++){
            count = 0 ;
            for(int j = 0; j<m ; j++){
                cin>>ch ;
                
                if(ch == '*'){
                    count++ ;
                }
            } // closing of inner for loop
            lights[i] = count ;
           
        } // closing of outer for loop
         cout<<solve(n,m,k,lights)<<"\n" ;
    } // closing of while loop
}

