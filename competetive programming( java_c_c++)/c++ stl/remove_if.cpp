#include <bits/stdc++.h>
using namespace std;

int num = 0 ; 

bool isToBeRemoved(int n){
    
    if( n <= 20 ){
        return true ;
    }else{
        num++ ;
        return false ;
    }
    
}


int main() {
    int n ; 
    cin>>n ; 
    
    int arr[n] ;
    
    for( int  i = 0 ; i < n ; i++ ){
        cin>>arr[i] ;
    }
    
    // original array
    cout<<"elements initially :  " ;
    for(int i =  0 ; i < n; i++ ){
        cout<< arr[i] << "  " ;
    }
    cout<<endl ;
     
    remove_if(arr , arr+n , isToBeRemoved ) ;
    
    // showing the elements which are removed
    cout<<"removed elements :    " ;
    for(int i =  0 ; i < num ; i++ ){
        cout<< arr[i] << "  " ;
    }
    cout<<endl ;
    
    // original array after remove _if operations 
    cout<<"elements finally :    " ;
    for(int i =  0 ; i < n; i++ ){
        cout<< arr[i] << "  " ;
    }
}
