//Recursive sequence ( SEQ - spoj )
#include <bits/stdc++.h>
using namespace std;
#define ll long long int
#define mod 1000000000
ll k ;
vector<ll>a , b ;

vector< vector<ll> > multiply( vector<vector<ll> > A, vector<vector<ll> >B  ){
   //resultant matrix
   vector<vector<ll> >C(k+1 , vector<ll>(k+1) ) ;
 
   for(int i = 1 ; i <= k ; i++){
       for(int j = 1; j <= k ; j++ ){
           for(int x = 1 ; x <= k ; x++){
               C[i][j] = ( C[i][j] + ( A[i][x]*B[x][j] )%mod   )%mod ;
           }
       }
   } 
   return C ;
}

vector< vector<ll> > pow(vector<vector<ll> > A, ll n ){
  if(n == 1){
      return A ;
  }

  if(n & 1){
      return multiply(A , pow(A , n-1) ) ;
  }else{
      vector< vector<ll> > x = pow(A , n/2) ;
      return multiply(x,x) ;
  }

}


ll compute(ll n){
    if( n==0 ){
        return 0 ;
    }
    if(n <= k ){
        return a[n-1] ;
    }

    // else start steps for matrix exponentiation
    //step1 - make initial vector
    vector<ll>F1(k+1) ;
    for(int i = 1 ; i<= k ;i++ ){
        F1[i] = a[i-1] ;
    }

    
    // step2 - make transformation matrix 
    vector<vector<ll> >T(k+1 , vector<ll>(k+1) ) ;
    for(int i = 1  ; i<=k ; i++ ){
        for(int j=1 ; j<=k ; j++ ){
             if(i<k){
               if(j == i+1){
                   T[i][j] = 1 ;
               }else{
                   T[i][j] = 0 ;
               }
               continue ;
             }

             // last row - store the coefficients in reverse order
             T[i][j] = b[k-j] ;
        }
    }

    // step3 - compute T^n-1
    T = pow(T , n-1) ;
    //step4 - multiply T^n-1 with F1
    ll res = 0 ;
    for(int i = 1 ; i <= k ; i++ ){
        res = ( res + (T[1][i]*F1[i])%mod)%mod ;
    }

    return res ;
}

int main() {
    ll  n , t , num ; 
    
    cin>>t ; 

    while(t-- ){
        //number of terms on which f(i) depends 
        cin>>k ;
        //Init vector f1
        for(int i = 0 ; i<k ; i++){
            cin>>num ;
            a.push_back(num) ;
        }

        //coefficients
        for(int i = 0 ; i < k ; i++){
            cin>>num ;
            b.push_back(num) ;
        }
        // the value of n
        cin>>n ;
        cout<<compute(n)<<endl ;
        
        a.clear() ;
        b.clear() ;
    }
}
