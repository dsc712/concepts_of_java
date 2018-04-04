#include <bits/stdc++.h>
using namespace std;
int main() {
    typedef pair<int , int > ii ;
    map< ii , string > table ;
    
    int n , q;
    string name ;
    cin>>n ;
    ii code ;
    
    for(int i=0 ; i<n ; i++){
        
        cin>>code.first>>code.second ;
        cin>>name ;
        
        table[code] = name ;
    }
    
    cin>>q ;
    
    for(int i=0 ; i<q ; i++){
        cin>>code.first>>code.second ;
        cout<<table[code]<<endl ;
    }
 }